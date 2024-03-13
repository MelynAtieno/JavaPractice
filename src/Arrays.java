public class Arrays {
    public static void main(String[] args){
        //declare an array of integers. reference variable
        int[] myArray; // - Compile time

        //allocates memory for 5 integers
        myArray = // -creating the object in heap memory. Runtime.....Dynamic memory allocation
                 new // -used to create an object
                         int[5];

        //initialize the first element
        myArray[0] = 100;

        //initialize the rest of the elements
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;
        
        //print output
        System.out.println("The first element in the array is:" + myArray[0]);
        System.out.println("The second element in the array is:" + myArray[1]);
        System.out.println("The third element in the array is:" + myArray[2]);
        System.out.println("The fourth element in the array is:" + myArray[3]);
        System.out.println("The fifth element in the array is:" + myArray[4]);

        System.out.println("That's it. Hurray!");

        //Shortcut syntax to create and initialize an array
        //int[] myArray = {100,200,300,400,500};
        //System.out.println("The first element of the array is : " + myArray[0]);
        /**the length of the array will be determined by 
        the number of values between the braces, separated by commas**/
        
        
    }
}
