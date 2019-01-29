package app;

import java.util.*;
import java.util.Scanner;

public class App {
    String collectInput;
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<Double>();

            //Perform tasks such as asking for user input. This also parses that input looking for ?, x, or X
            do{
                System.out.println("Enter A Number to Add to Statistics. Enter ? to Print All Numbers Entered or Enter x or X to exit");
                var collectInput = input.nextLine();

                if (collectInput.equals("?")){
                    System.out.println("The user has input the following numbers" + numbers);
                }else{

                if (collectInput.equals("x") || collectInput.equals("X")) {
                    System.out.println("Entered escape command. Exiting program...");
                    System.exit(0);
                }else{

                //Adds the Collected User Data to the ArrayList
                double dataCollected = Double.parseDouble(collectInput);
                numbers.add(dataCollected);
                //Print Information About the Array List
                System.out.println("User Added Number: " + dataCollected);
                System.out.println("Count has increased to: " + numbers.size());
                

                System.out.println("The Average of All Numbers is: ");

                System.out.println("Enter A Number to Add to Statistics. Enter ? to Print All Numbers Entered or Enter x or X to exit");
                }
            }
            }while(input.hasNext());
    
    }
}