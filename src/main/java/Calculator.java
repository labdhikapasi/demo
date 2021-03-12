

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 to Square Root\nPress 2 to Factorial\nPress 3 to Log (base e)\nPress 4 to Power\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            try {


                switch (choice) {
                    case 1:

                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                        System.out.println("Square Root result is : " + calculator.squareRoot(number1));
                        break;
                    case 2:
                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                        System.out.println("Factorial result is : " + calculator.factorial(number1));
                        break;
                    case 3:
                        System.out.print("Enter the number : ");
                        number1 = scanner.nextDouble();
                        System.out.println("Log result is : " + calculator.log(number1));
                        break;
                    case 4:
                        System.out.print("Enter the first number : ");
                        number1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        number2 = scanner.nextDouble();
                        System.out.println("Power result is : " + calculator.power(number1, number2));
                        break;
                    default:
                        System.out.println("Exiting....");
                        return;
                }
            } catch (InputMismatchException error) {
                logger.error("Invalid input, Entered input is not a number");
                return;
            }
        } while (true);

    }


    public double squareRoot(double number1) {
        logger.info("[SQUARE ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public int factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        int result = 1;
        if(number1 == 1)
            return 1;
        for(int i=2; i<=number1; i++){
            result*=i;
        }
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }


    public double log(double number1) {
        logger.info("[LOG] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - LOG] - " + result);
        return result;
    }

    public double power(double number1, double number2) {
        logger.info("[POWER] - " + number1 +","+number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

}
