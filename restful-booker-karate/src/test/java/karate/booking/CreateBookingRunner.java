package karate.booking;


import com.intuit.karate.junit5.Karate;

import static karate.ConstantString.CLASS_PATH_CREATE_BOOKING;

public class CreateBookingRunner {

    @Karate.Test
    Karate testSystemProperty() {
        return Karate.run(CLASS_PATH_CREATE_BOOKING);
    }
}
