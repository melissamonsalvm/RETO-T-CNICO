package karate.booking.runners;

import com.intuit.karate.junit5.Karate;

import static karate.booking.utils.ConstantString.CLASS_PATH_GET_BOOKING;

public class GetBookingRunner {

    @Karate.Test
    Karate testSystemProperty() {
        return Karate.run(CLASS_PATH_GET_BOOKING);
    }
}
