import java.util.Scanner;

public class TerminalInput {
    public static void main(String[] args){

    Scanner stringScan = new Scanner(System.in); // Create a scanner object
    System.out.println("What is your name?");

    String name = stringScan.nextLine(); // Read user input
    System.out.println("My name is:"+ " " + name + "."); // Output user input

    stringScan.close();
    
    
    }
    
}
