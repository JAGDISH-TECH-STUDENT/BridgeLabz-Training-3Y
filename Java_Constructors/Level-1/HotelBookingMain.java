public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("Ravi", "Deluxe", 3);
        HotelBooking hb3 = new HotelBooking(hb2);
        hb1.display();
        hb2.display();
        hb3.display();
    }
}

