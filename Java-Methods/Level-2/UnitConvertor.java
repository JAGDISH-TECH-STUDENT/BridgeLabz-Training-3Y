 import java.util.Scanner;
public class UnitConvertor {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Unit Converter 🔁");
        System.out.println("Choose a conversion:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.println("5. Yards to Feet");
        System.out.println("6. Feet to Yards");
        System.out.println("7. Meters to Inches");
        System.out.println("8. Inches to Meters");
        System.out.println("9. Inches to Centimeters");
        System.out.println("10. Fahrenheit to Celsius");
        System.out.println("11. Celsius to Fahrenheit");
        System.out.println("12. Pounds to Kilograms");
        System.out.println("13. Kilograms to Pounds");
        System.out.println("14. Gallons to Liters");
        System.out.println("15. Liters to Gallons");
        System.out.print("Enter your choice (1 to 15): ");
        int choice = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1: result = UnitConvertor.convertKmToMiles(value); break;
            case 2: result = UnitConvertor.convertMilesToKm(value); break;
            case 3: result = UnitConvertor.convertMetersToFeet(value); break;
            case 4: result = UnitConvertor.convertFeetToMeters(value); break;
            case 5: result = UnitConvertor.convertYardsToFeet(value); break;
            case 6: result = UnitConvertor.convertFeetToYards(value); break;
            case 7: result = UnitConvertor.convertMetersToInches(value); break;
            case 8: result = UnitConvertor.convertInchesToMeters(value); break;
            case 9: result = UnitConvertor.convertInchesToCm(value); break;
            case 10: result = UnitConvertor.convertFahrenheitToCelsius(value); break;
            case 11: result = UnitConvertor.convertCelsiusToFahrenheit(value); break;
            case 12: result = UnitConvertor.convertPoundsToKg(value); break;
            case 13: result = UnitConvertor.convertKgToPounds(value); break;
            case 14: result = UnitConvertor.convertGallonsToLiters(value); break;
            case 15: result = UnitConvertor.convertLitersToGallons(value); break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        System.out.println("Converted value: " + result);
        sc.close();
    }
}


