package karate.booking.runners;

import com.intuit.karate.junit5.Karate;

import static karate.booking.utils.ConstantString.CLASS_PATH_UPDATE_BOOKING;

public class UpdateBookingRunner {
    @Karate.Test
    Karate testSystemProperty() {
        return Karate.run(CLASS_PATH_UPDATE_BOOKING);
    }
}
