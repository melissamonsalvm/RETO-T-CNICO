package booking;


import com.intuit.karate.junit5.Karate;

public class BookingRunner {

    @Karate.Test
    public Karate testsBooking() {
        return Karate.run("classpath:booking/create-booking.feature");
    }
}
