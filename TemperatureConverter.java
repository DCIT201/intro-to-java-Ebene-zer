import java.util.Scanner;

public class TemperatureConverter {
    public TemperatureConverter() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//  Inform user the purpose of this program
        System.out.println("Hey! Do you want to convert temperature from Celsius to Fahrenheit or vice versa?");
        System.out.println("I'm here to help.");

//  Display options from which user can choose
        System.out.println("Choose from the below options (1 or 2): ");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

//  Take user input (Precisely integer/ 1 or 2)
        int Input = scanner.nextInt();

//  Conditional statement to be executed based on user input above
        if (Input == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * ((double)9.0F / (double)5.0F)) + (double)32.0F;
            System.out.printf("Temperature in Fahrenheit is: %.2f°F%n", fahrenheit);
            System.out.println("You have any other value to convert? Feel free to bring it.");

        } else if (Input == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - (double)32.0F) * ((double)5.0F / (double)9.0F);
            System.out.printf("Temperature in Celsius is: %.2f°C%n", celsius);
            System.out.println("You have any other value to convert? Feel free to bring it.");

        } else {
            System.out.println("Sorry, your input is invalid. Please restart the program and choose between 1 or 2.");
        }

        System.out.print("Thank you.");

        scanner.close();
    }
}
