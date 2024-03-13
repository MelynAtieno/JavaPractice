import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = in.nextInt();
        }
        System.out.println(array1[1]);

        //for each loop
        for(int num : array1)//num(element) in array1, print num(element). num represents the element of the array
            {
            System.out.print(num + " ");
            //change an array to string
                //System.out.print(Arrays.toString(Array1))
        }
    }
}
