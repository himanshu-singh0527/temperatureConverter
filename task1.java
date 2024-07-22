import java.util.*;

public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the temperature value
        System.out.print("Enter the temperature value: ");
        double temperature = sc.nextDouble();

        // Prompt user to enter the unit of measurement
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        char unit = sc.next().charAt(0);

        double convertedTemperature;

        // Perform the conversion based on the input unit
        if (unit == 'C' || unit == 'c') {
            // Convert from Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F");
        } else if (unit == 'F' || unit == 'f') {
            // Convert from Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C");
        } else {
            System.out.println("Invalid unit of measurement. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }
}
