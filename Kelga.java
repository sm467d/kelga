package conversions;

import java.util.Scanner;

public class Kelga {
    // Method that converts mpg to km/l
    public static double mpgToKml(double mpg){
        double kml = mpg * 0.425143707;
        return kml;
    }

    // Method that converts km/l to mpg
    public static double kmlToMpg(double kml){
        double mpg = kml / 0.425143707;
        return mpg;
    }

    // Methods that converts Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin){
        double celsius = kelvin - 273.15;
        return celsius;
    }

    //Method that converts Celsius to Kelvin
    public static double celsiusToKelvin(double celsius){
        double kelvin = celsius + 273.15;
        return kelvin;
    }

}
