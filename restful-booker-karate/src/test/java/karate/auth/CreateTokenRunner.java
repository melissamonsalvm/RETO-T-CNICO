package karate.auth;

import com.intuit.karate.junit5.Karate;

import static karate.ConstantString.CLASS_PATH_CREATE_TOKEN;

public class CreateTokenRunner {

    @Karate.Test
    Karate testSystemProperty() {
        return Karate.run(CLASS_PATH_CREATE_TOKEN);
    }
}
