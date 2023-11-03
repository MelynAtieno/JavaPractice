//import java.io.IOException;
import java.util.Scanner;

public class TerminalInput {
    public static void main(String[] args){
        
    
    // String scanner
    Scanner stringScan = new Scanner(System.in); // Create a scanner object
    System.out.println("What is your name?");

    String name = stringScan.nextLine(); // Read user input
    //System.out.println("My name is:"+ " " + name + "."); // Output user input
    
    //stringScan.close();
    

    // Integer scanner
    
    Scanner intScan = new Scanner(System.in);
    System.out.println("How old are you " + name + "?");

    int age = intScan.nextInt();
    System.out.println("I am " + age + " years old");

    stringScan.close();
    intScan.close();
    
    
    }
    
}
