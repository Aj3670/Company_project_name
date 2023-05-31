import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        double temperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(temperature);
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            case 3:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                double kelvinC = celsiusToKelvin(temperature);
                System.out.println("Temperature in Kelvin: " + kelvinC);
                break;
            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                double celsiusK = kelvinToCelsius(temperature);
                System.out.println("Temperature in Celsius: " + celsiusK);
                break;
            case 5:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                double kelvinF = fahrenheitToKelvin(temperature);
                System.out.println("Temperature in Kelvin: " + kelvinF);
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                temperature = scanner.nextDouble();
                double fahrenheitK = kelvinToFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit: " + fahrenheitK);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
                
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
