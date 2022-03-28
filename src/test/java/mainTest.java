import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mainTest {

    // To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and multiply by 5/9
    @Test
    @DisplayName("Conversion from F to C")
    public final void checkIfCorrectlyConverted(){
        assertEquals(40, Main.convertToCelsius(104), 0);
    }

    @Test
    @DisplayName("Check if celsiusOrFahrenheit2 returns the correct String")
    public void checkIfCelsius(){
        assertEquals("Celsius", Main.celsiusOrFahrenheit(30));
    }
}
