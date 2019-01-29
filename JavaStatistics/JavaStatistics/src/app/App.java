package app;

import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int count = 0;
        //String collectInput;


        double[] numbers = new double[count];
       
       
        //Removed Code from the do while loop
        //int i; i = count.length; i++
        //input != x || input != X
       /* System.out.println("Enter Something if it's an x or X we will quit hopefully");
        double collectNumbers = input.nextDouble();

        input.nextLine();
        String collectText = input.nextLine();

        if (collectText == "x" || collectText == "X") {
            System.exit(1);
        }*/
            do{
                System.out.println("Enter Next Number or x X to exit");
                String collectInput = input.nextLine();
                if (collectInput.equals("?")){
                    System.out.println("The user has input the following numbers" + numbers);
                }else{

                if (collectInput.equals("x") || collectInput.equals("X")) {
                    System.out.println("Entered escape command. Exiting program...");
                    System.exit(0);
                }else{
                
                double dataCollected = Double.parseDouble(collectInput);
                System.out.println("User Added Number: " + dataCollected);
                }
            }
            }while(input.hasNext());
        


        
/*
            do{
                System.out.println("Enter Next Number or x X to exit");
                collectInput = input.nextLine();
                if (collectInput == "x" || collectInput == "X") {
                    break;
                }
                double dataCollected = Double.parseDouble(collectInput);
                System.out.println("User Added Number: " + dataCollected);

            }while(input.hasNext()); */
        /*
        (input.hasNext() && input.equals("x") || input.equals("X")
            while(true) {
                System.out.println("Enter Next Number or x X to exit");
                try {
                    double collectNumbers = input.nextDouble();
                    System.out.println("User Added Number: " + collectNumbers);
                } catch (InputMismatchException e) {
                    System.out.println("What a damn mess!");
                } finally {
                    System.exit(1);
                }

            }*/


           
    }
}