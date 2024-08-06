package conditional;

import java.util.*;

public class TemperatureMetricConverted {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        
        switch(choice) {
        case 1: System.out.println("The converted value is " + CelciusToFahrenheit(temperature) + "F");
                break;
        case 2: System.out.println("The converted value is " + FahrenheitToCelcius(temperature) + "C");
                break;
        case 3: System.out.println("The converted value is " + CelciusToKelvin(temperature) + "K");
                break;
        case 4: System.out.println("The converted value is " + KelvinToCelcius(temperature) + "C");
                break;
        case 5: System.out.println("The converted value is " + CelciusToKelvin(FahrenheitToCelcius(temperature)) + "K");
                break; 
        case 6: System.out.println("The converted value is " + CelciusToFahrenheit(KelvinToCelcius(temperature)) + "F");
                break;
        default : System.out.println("Enter a valid choice");
        }
	}
	
	public static double CelciusToFahrenheit(double temperature) {
		temperature = (temperature * 9 / 5) + 32;
		return temperature;
	}
	
	public static double FahrenheitToCelcius(double temperature) {
		temperature = (temperature-32) * 5 / 9;
		return temperature;
	}
	
	public static double CelciusToKelvin(double temperature) {
		temperature = temperature + 273.15;
		return temperature;
	}
	

	public static double KelvinToCelcius(double temperature) {
		temperature = temperature - 273.15;
		return temperature;
	}

}
