/**
 * Created by xxxian on 7/18/17.
 */

import java.util.Scanner;

public class MathOp {
    public static void main(String[] args) {

        System.out.println(twoStringNum());
    }

    public static String twoStringNum() {
        Scanner scanner1 = new Scanner(System.in);

        while (true) try {
            System.out.println("Please enter the first number");
            String operand1 = scanner1.nextLine();
            System.out.println("Please enter the second number");
            String operand2 = scanner1.nextLine();
            double num1 = Double.parseDouble(operand1);
            double num2 = Double.parseDouble(operand2);
            double sum = num1 + num2;
            double difference = num1 - num2;
            double division = num1 / num2;
            double multiplycation = num1 * num2;
            double remainder = num1 % num2;
            String showResults = "Sum: " + sum + " Subtraction: " + division + " Multiply: " + multiplycation + " remainder: " + remainder;
            return showResults;
        } catch (NumberFormatException ignore) {
            System.out.println(ignore);
            System.out.println();
            System.out.println("RETURNING TO THE TOP, ONLY PUT INT/DOUBLE TYPE");
        }


    }
}
