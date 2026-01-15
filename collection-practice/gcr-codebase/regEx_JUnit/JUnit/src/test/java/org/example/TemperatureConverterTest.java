package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

public class TemperatureConverterTest {
    TemperatureConverter converter=new TemperatureConverter();

    @ParameterizedTest
    @CsvSource({
            "0, 32",
            "100, 212",
            "37, 98.6",
            "-40, -40"
    })
    void testCelsiusToFahrenheit(double celsius, double expectedFahrenheit) {
        assertEquals(expectedFahrenheit, converter.celsiusToFahrenheit(celsius), 0.01);
    }

    @ParameterizedTest
    @CsvSource({
            "32, 0",
            "212, 100",
            "98.6, 37",
            "-40, -40"
    })
    void testFahrenheitToCelsius(double fahrenheit, double expectedCelsius) {
        assertEquals(expectedCelsius, converter.fahrenheitToCelsius(fahrenheit), 0.01);
    }
}

