package app;

import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int count = 0;

        double[] numbers = new double[count];


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
                System.out.println("Count has increased to" + count);
                }
            }
            }while(input.hasNext());
    
    }
}