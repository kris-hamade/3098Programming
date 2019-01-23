import java.util.*;
import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
      
        //Create Variables
        int numberOne, numberTwo, sum;
        String operator;

        //Create Scanner to Ask User for the Operand
        System.out.print("Enter the operator that you wish to use: ");
        System.out.println("Choose from + - * / or exit");
        Scanner operand = new Scanner(System.in);
        operator = operand.next();
        System.out.println("You chose: " + operator);
       
        //Create Scanner to Ask User for First Number
        System.out.print("Enter first number: ");
        Scanner inputOne = new Scanner(System.in);

        numberOne = inputOne.nextInt();
        //System.out.println("Your first number is: " + numberOne);

        //Create Scanner to Ask User for Second Number
        System.out.print("Enter second number: ");
        Scanner inputTwo = new Scanner(System.in);

        numberTwo = inputTwo.nextInt();
        //System.out.println("Your first number is: " + numberTwo);

        System.out.println(numberOne + operator +  numberTwo + "=");
        //Calculate based on selected operator and numbers
            switch (operator) {
            case "+":
                System.out.println("You have chosen addition");
                sum = numberOne + numberTwo;
                System.out.println("Your total is " + sum);
                break;
            
            case "-":
                System.out.println("You have chosen subtraction");
                sum = numberOne - numberTwo;
                System.out.println("Your total is " + sum);
                break;
            
            case "*":
                System.out.println("You have chosen multiplication");
                sum = numberOne * numberTwo;
                System.out.println("Your total is " + sum);
                break;

            case "/":
                System.out.println("You have chosen division");
                sum = numberOne / numberTwo;
                System.out.println("Your total is " + sum);
                break;
            
            case "exit":
                System.out.println("You have chosen to exit the program");
                System.out.println("Goodbye!");
                System.exit(1);
                break;

        }
            
            
    }
    
}
