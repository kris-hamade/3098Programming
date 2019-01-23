package app;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        
        //Create Variables
        int numberOne, numberTwo, sum;
        char operator;

        //Create Scanner to Ask User for First Number
        System.out.print("Enter first number: ");
        Scanner inputOne = new Scanner(System.in);

        numberOne = inputOne.nextInt();

        //Create Scanner to Ask User for Second Number
        System.out.print("Enter second number: ");
        Scanner inputTwo = new Scanner(System.in);

        numberTwo = inputTwo.nextInt();

        //Create Scanner to Ask User for the Operand
        System.out.print("Enter the operator that you wish to use: ");
        Scanner operand = new Scanner(System.in);
        operator = operand.next()

        //Completes the equation


    }

}
    