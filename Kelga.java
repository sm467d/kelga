package conversions;

public class Kelga {
    // Method that converts mpg to km/l
    public static double mpgToKpl(double mpg){
        double kpl = mpg * 0.425143707;
        return kpl;
    }

    // Method that converts km/l to mpg
    public static double kplToMpg(double kpl){
        double mpg = kpl / 0.425143707;
        return mpg;
    }

    // Method that converts Kelvin to Celsius
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
