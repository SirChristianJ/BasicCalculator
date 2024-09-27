package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float firstNum = scanner.nextFloat();
        //scanner.nextLine();

        System.out.print("Enter the second number: ");
        float secondNum = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Possible calculations: \n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide\nPlease select an option: ");
        String selection = scanner.nextLine();
        switch(selection) {
            case "A":
                System.out.print(firstNum + "+" + secondNum + " = " + (firstNum + secondNum));
                break;

            case "S":
                System.out.print(firstNum + "-" + secondNum +  " = " + (firstNum - secondNum));
                break;

            case "M":
                System.out.print(firstNum + "*" + secondNum +  " = " + (firstNum * secondNum));
                break;

            case "D":
                System.out.print(firstNum + "/" + secondNum +  " = " + (firstNum / secondNum) + "\n");
                break;

            default:
                System.out.print("Not a valid option ! Try Again !");
        }


    }
}
