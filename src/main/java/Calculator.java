

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("Below are Calculator Operations\nChoose among 1 to 4...\n\n");
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

                        System.out.print("Enter the number for SquareRoot : ");
                        num1 = scanner.nextDouble();
                        System.out.println("Square Root result is : " + calculator.squareRoot(num1)+"\n\n");
                        break;
                    case 2:
                        System.out.print("Enter the number for Factorial : ");
                        num1 = scanner.nextDouble();
                        System.out.println("Factorial result is : " + calculator.factorial(num1)+"\n\n");
                        break;
                    case 3:
                        System.out.print("Enter the number for Log: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Log result is : " + calculator.log(num1)+"\n\n");
                        break;
                    case 4:
                        System.out.print("Enter the first number for Power : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number for Power: ");
                        num2 = scanner.nextDouble();
                        System.out.println("Power result is : " + calculator.power(num1, num2)+"\n\n");
                        break;
                    default:
                        System.out.println("Exiting....");
                        return;
                }
            } catch (InputMismatchException error) {
                logger.error("Invalid input, Entered input is invalid number");
                return;
            }
        } while (true);

    }


    public double squareRoot(double num1) {
        logger.info("[SQUARE ROOT] argument - " + num1);
        double result = Math.sqrt(num1);
        logger.info("[SQUARE ROOT] result - " + result);
        return result;
    }

    public int factorial(double num1) {
        logger.info("[FACTORIAL] argument - " + num1);
        int result = 1;
        if(num1 == 1)
            return 1;
        for(int i=2; i<=num1; i++){
            result*=i;
        }
        logger.info("[FACTORIAL] result - " + result);
        return result;
    }


    public double log(double num1) {
        logger.info("[LOG] argument - " + num1);
        double result = Math.log(num1);
        logger.info("[LOG] result - " + result);
        return result;
    }

    public double power(double num1, double num2) {
        logger.info("[POWER] argument - " + num1 +","+num2);
        double result = Math.pow(num1,num2);
        logger.info("[POWER] result - " + result);
        return result;
    }

}
