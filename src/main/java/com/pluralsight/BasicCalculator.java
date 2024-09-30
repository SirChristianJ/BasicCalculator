package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float firstNum = promptForFloat("Enter your first number: ");
        float secondNum = promptForFloat("Enter a second number: ");

        System.out.print("Possible calculations: \n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide\nPlease select an option: ");
        String selection = scanner.nextLine();

        switch (selection) {
            case "A":
            case "a":
                add(firstNum, secondNum);
                break;

            case "S":
            case "s":
                subtract(firstNum, secondNum);
                break;

            case "M":
            case "m":
                multiply(firstNum, secondNum);
                break;

            case "D":
            case "d":
                divide(firstNum, secondNum);
                break;

            default:
                System.out.print("Not a valid option ! Try Again !");
        }
    }

    public static float promptForFloat(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        float num = scanner.nextFloat();
        scanner.nextLine();

        return num;
    }

    public static void add(float num1, float num2){
        System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtract(float num1, float num2){
        System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiply(float num1, float num2){
        System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void divide(float num1, float num2){
        System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}

