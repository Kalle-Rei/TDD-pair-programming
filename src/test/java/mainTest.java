import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mainTest {

    // To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and multiply by 5/9
    @Test
    @DisplayName("Conversion from F to C")
    @Disabled
    public final void checkIfCorrectlyConverted(){
        assertEquals(40, Main.convertToCelsius(104), 0);
    }

    // 0-30 C, >30 F
    @Test
    public void checkIfCelsius(){
        assertEquals(0, Main.celsiusOrFahrenheit(30));
    }
    @Test
    public void checkIfFahrenheit(){
        assertEquals(1, Main.celsiusOrFahrenheit(31));
    }

    @Test
    @DisplayName("Check if celsiusOrFahrenheit2 returns the correct String")
    public void checkIfCelsius2(){
        assertEquals("Celsius", Main.celsiusOrFahrenheit2(30));
    }
}
