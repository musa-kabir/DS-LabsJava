import java.util.Scanner;


public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        startCalc();
    }

    public static void display() {
        System.out.println("This program is a simple calculator, type exit to stop or type anything to continue.");
    }

    public static void startCalc() {
        String userInput = "";
        while (!userInput.equalsIgnoreCase("exit")) {
            display();
            userInput = input.next();
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter a number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter an operator, +, -, *, or /: ");
            String operator = input.next();
            System.out.print("Enter a number: ");
            double num2 = input.nextDouble();
            doCalc(num1, operator, num2);
        }
    }

    public static void doCalc(double num1, String operator, double num2) {
        double calculation = 0;
        switch (operator) {
            case "+":
                calculation = num1 + num2;
                System.out.println("The result is: " + calculation);
                break;
            case "-":
                calculation = num1 - num2;
                System.out.println("The result is: " + calculation);
                break;
            case "*":
                calculation = num1 * num2;
                System.out.println("The result is: " + calculation);
                break;
            case "/":
                calculation = num1 / num2;
                System.out.println("The result is: " + calculation);
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}

