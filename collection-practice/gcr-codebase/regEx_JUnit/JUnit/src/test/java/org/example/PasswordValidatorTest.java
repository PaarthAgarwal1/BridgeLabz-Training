package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PasswordValidatorTest {
    PasswordValidator validator=new PasswordValidator();

    @ParameterizedTest
    @ValueSource(strings = {"StrongPass1", "Hello123A", "Secure99X", "JavaRocks1"})
    void testValidPassword(String password){
        assertTrue(validator.isValid(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "short1A",      // too short
            "password1",    // no uppercase
            "Password",     // no digit
            "PASSWORD1"     // no lowercase
    })
    void testInvalidPasswords(String password){
        assertFalse(validator.isValid(password));
    }
}
