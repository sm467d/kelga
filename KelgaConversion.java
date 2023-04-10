package conversions;
import java.util.Scanner;

public class KelgaConversion {
    public static void main(String[] args){
        Kelga kelga = new Kelga();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Kelga - Convert with Confidence!");
        System.out.println("Please select an option: ");
        System.out.println("(1) Convert Fuel Efficiency (mpg & km/l)");
        System.out.println("(2) Convert Temperature (Kelvin & Celsius)");
        System.out.println("(3) Exit\n");

        int option = input.nextInt();

        if (option == 1){
            System.out.println("Please select an option: ");
            System.out.println("(1) Convert mpg to kpl");
            System.out.println("(2) Convert kpl to mpg\n");
            int option1 = input.nextInt();
            if (option1 == 1){
                System.out.println("Please enter the value in mpg: ");
                double mpg = input.nextDouble();
                double kpl = kelga.mpgToKpl(mpg);
                System.out.println(mpg + " mpg is equal to " + kpl + " kpl");
            }
            else if (option1 == 2){
                System.out.println("Please enter the value in kpl: ");
                double kpl = input.nextDouble();
                double mpg = kelga.kplToMpg(kpl);
                System.out.println(kpl + " kpl is equal to " + mpg + " mpg");
            }
            else{
                System.out.println("Invalid option!");
            }
        }
        else if (option == 2){
            System.out.println("Please select an option: ");
            System.out.println("(1) Convert Kelvin to Celsius");
            System.out.println("(2) Convert Celsius to Kelvin\n");
            int option2 = input.nextInt();
            if (option2 == 1){
                System.out.println("Please enter the value in Kelvin: ");
                double kelvin = input.nextDouble();
                double celsius = kelga.kelvinToCelsius(kelvin);
                System.out.println(kelvin + " Kelvin is equal to " + celsius + " Celsius");
            }
            else if (option2 == 2){
                System.out.println("Please enter the value in Celsius: ");
                double celsius = input.nextDouble();
                double kelvin = kelga.celsiusToKelvin(celsius);
                System.out.println(celsius + " Celsius is equal to " + kelvin + " Kelvin");
            }
            else{
                System.out.println("Invalid option!");
            }
        }
        else if (option == 3){
            System.out.println("Exiting...");
        }
        else{
            System.out.println("Invalid option!");
        }

        System.out.println("Thank you for using Kelga!");

    }
}
