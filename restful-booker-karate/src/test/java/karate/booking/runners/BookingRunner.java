package karate.booking.runners;


import com.intuit.karate.junit5.Karate;

import static karate.booking.utils.ConstantString.CLASS_PATH_CREATE_BOOKING;

public class BookingRunner
{
    @Karate.Test
    Karate testSystemProperty() {
        return Karate.run("classpath:karate/features/create-booking.feature");
    }
}
