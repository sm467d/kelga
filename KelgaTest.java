package conversions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KelgaTest {

    // Test case 1: Conversion of Honda Odyssey fuel consumption (KPL) to MPG with a specific value
    @Test
    public void testKplToMpg_hondaOdysseyValue1() {
        double kpl = 10.0;
        double expectedMpg = 23.521437035;
        double delta = 0.0001; // Tolerance for floating-point comparisons
        assertEquals(expectedMpg, Kelga.kplToMpg(kpl), delta);
    }

    // Test case 2: Conversion of Honda Odyssey fuel consumption (KPL) to MPG with another specific value
    @Test
    public void testKplToMpg_hondaOdysseyValue2() {
        double kpl = 11.5;
        double expectedMpg = 27.04967711070;
        double delta = 0.0001; // Tolerance for floating-point comparisons
        assertEquals(expectedMpg, Kelga.kplToMpg(kpl), delta);
    }

    // Test case 3: Conversion of Honda Odyssey fuel consumption (mpg) to KPL with a specific value
    @Test
    public void testMpgToKpl_hondaOdysseyValue1() {
        double mpg = 23.521437035;
        double expectedKpl = 10.0;
        double delta = 0.001; // Tolerance for floating-point comparisons
        assertEquals(expectedKpl, Kelga.mpgToKpl(mpg), delta);
    }

    // Test case 4: Conversion of Honda Odyssey fuel consumption (mpg) to KPL with another specific value
    @Test
    public void testMpgToKpl_hondaOdysseyValue2() {
        double mpg = 27.04955229025;
        double expectedKpl = 11.5;
        double delta = 0.001; // Tolerance for floating-point comparisons
        assertEquals(expectedKpl, Kelga.mpgToKpl(mpg), delta);
    }

    // Test case 5: Conversion of rental car fuel consumption (mpg) to KPL with a specific value
    @Test
    public void testMpgToKpl_rentalCarValue1() {
        double mpg = 30.0;
        double expectedKpl = 12.75431421;
        double delta = 0.001; // Tolerance for floating-point comparisons
        assertEquals(expectedKpl, Kelga.mpgToKpl(mpg), delta);
    }

    // Test case 6: Conversion of rental car fuel consumption (mpg) to KPL with another specific value
    @Test
    public void testMpgToKpl_rentalCarValue2() {
        double mpg = 35.0;
        double expectedKpl = 14.88017622;
        double delta = 0.001; // Tolerance for floating-point comparisons
        assertEquals(expectedKpl, Kelga.mpgToKpl(mpg), delta);
    }

    // Test case 7: Conversion of rental car fuel consumption (KPL) to MPG with a specific value
    @Test
    public void testKplToMpg_rentalCarValue1() {
        double kpl = 12.75431421;
        double expectedMpg = 30.0;
        double delta = 0.001; // Tolerance for floating-point comparisons
        assertEquals(expectedMpg, Kelga.kplToMpg(kpl), delta);
    }

    // Test case 8: Conversion of rental car fuel consumption (KPL) to MPG with another specific value
    @Test
    public void testKplToMpg_rentalCarValue2() {
        double kpl = 14.88017622;
        double expectedMpg = 35.0;
        double delta = 0.001; // Tolerance for floating-point comparisons
        assertEquals(expectedMpg, Kelga.kplToMpg(kpl), delta);
    }

    // Test case 9: Conversion of a temperature in Kelvin to Celsius with a positive value
    @Test
    public void testKelvinToCelsius_positiveValue() {
        double kelvin = 300.0;
        double expectedCelsius = 26.85;
        double delta = 0.01; // Tolerance for floating-point comparisons
        assertEquals(expectedCelsius, Kelga.kelvinToCelsius(kelvin), delta);
    }

    // Test case 10: Conversion of a temperature in Kelvin to Celsius with a value at absolute zero
    @Test
    public void testKelvinToCelsius_absoluteZero() {
        double kelvin = 0.0;
        double expectedCelsius = -273.15;
        double delta = 0.01; // Tolerance for floating-point comparisons
        assertEquals(expectedCelsius, Kelga.kelvinToCelsius(kelvin), delta);
    }

    // Test case 11: Conversion of a temperature in Celsius to Kelvin with a positive value
    @Test
    public void testCelsiusToKelvin_positiveValue() {
        double celsius = 25.0;
        double expectedKelvin = 298.15;
        double delta = 0.01; // Tolerance for floating-point comparisons
        assertEquals(expectedKelvin, Kelga.celsiusToKelvin(celsius), delta);
    }

    // Test case 12: Conversion of a temperature in Celsius to Kelvin with a value at absolute zero
    @Test
    public void testCelsiusToKelvin_absoluteZero() {
        double celsius = -273.15;
        double expectedKelvin = 0.0;
        double delta = 0.01; // Tolerance for floating-point comparisons
        assertEquals(expectedKelvin, Kelga.celsiusToKelvin(celsius), delta);
    }

    // Test case 13: Conversion of a temperature in Celsius to Kelvin with a negative value
    @Test
    public void testCelsiusToKelvin_negativeValue() {
        double celsius = -50.0;
        double expectedKelvin = 223.15;
        double delta = 0.01; // Tolerance for floating-point comparisons
        assertEquals(expectedKelvin, Kelga.celsiusToKelvin(celsius), delta);
    }

    // Test case 14: Conversion of a temperature in Celsius to Kelvin with a decimal value
    @Test
    public void testCelsiusToKelvin_decimalValue() {
        double celsius = 15.5;
        double expectedKelvin = 288.65;
        double delta = 0.01; // Tolerance for floating-point comparisons
        assertEquals(expectedKelvin, Kelga.celsiusToKelvin(celsius), delta);
    }

    // Test case 15: Conversion of a temperature in Celsius to Kelvin with a negative decimal value
    @Test
    public void testCelsiusToKelvin_negativeDecimalValue() {
        double celsius = -10.5;
        double expectedKelvin = 262.65;
        double delta = 0.01; // Tolerance for floating-point comparisons
        assertEquals(expectedKelvin, Kelga.celsiusToKelvin(celsius), delta);
    }

    // Test case 16: Conversion of a temperature in Kelvin to Celsius with a decimal value
    @Test
    public void testKelvinToCelsius_decimalValue() {
        double kelvin = 310.45;
        double expectedCelsius = 37.3;
        double delta = 0.01; // Tolerance for floating-point comparisons
        assertEquals(expectedCelsius, Kelga.kelvinToCelsius(kelvin), delta);
    }

    // Test case 17: Conversion of a temperature in Kelvin to Celsius with a value between 0 and 1
    @Test
    public void testKelvinToCelsius_betweenZeroAndOne() {
        double kelvin = 0.85;
        double expectedCelsius = -272.3;
        double delta = 0.01; // Tolerance for floating-point comparisons
        assertEquals(expectedCelsius, Kelga.kelvinToCelsius(kelvin), delta);
    }


}
