/**
 * Created by xxxian on 7/18/17.
 */

import java.util.Scanner;

public class MathOp {
    public static void main(String[] args) {
        double firstNum = getNumber();
        double secondNum = getNumber();
        twoStringNum(firstNum, secondNum);
    }

    public static void twoStringNum(double operand1, double operand2) {
        Scanner scanner1 = new Scanner(System.in);
        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplycation = operand1 * operand2;
        double remainder = operand1 % operand2;
        System.out.println("Sum: " + sum + "\nDiff: " + difference + "\nDiv: " + division + "\nMulti: " + multiplycation + "\nRemainder: " + remainder);
    }

    private static double getNumber() {
        System.out.println("Put # please");
        Scanner scanner = new Scanner(System.in);
        double userInput;
        while (true) {
            try {
                userInput = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + "Invalid Input");
            }
        }

        return userInput;
    }


}

