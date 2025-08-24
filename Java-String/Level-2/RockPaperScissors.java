import java.util.*;

public class RockPaperScissors {

    public static String computerChoice() {
        int c = (int) (Math.random() * 3);
        if (c == 0){ 
            return "Rock";
        }
        else if (c == 1){ 
            return "Paper";
        }
        else return "Scissors";
    }

    public static String winner(String user, String com) {
        if (user.equals(com)){ 
            return "Draw";
        }
        if ((user.equals("Rock") && com.equals("Scissors")) ||
            (user.equals("Scissors") && com.equals("Paper")) ||
            (user.equals("Paper") && com.equals("Rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] playGames(int games) {
        String[][] results = new String[games][3];
        Scanner sc=new Scanner(System.in);
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.println("Enter choice (Rock/Paper/Scissors):");
            String user = sc.next();
            String comp = computerChoice();
            String win = winner(user, comp);
            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = win;
            if (win.equals("User")){ 
                userWins++;
            }
            else if (win.equals("Computer")){ 
                compWins++;
            }
        }

        System.out.println("\nGame Results:");
        System.out.println("User | Computer | Winner");
        System.out.println("--------------------------");
        for (int i = 0; i < games; i++) {
            System.out.println(results[i][0] + " | " + results[i][1] + " | " + results[i][2]);
        }

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins + " (" + userPercent + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPercent + "%)");

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many games");
        int games = sc.nextInt();
        playGames(games);
    }
}

