public class ControlFlow {
    //For Loop
    public static void main(String[] args){
        int[] anArray = {10,20,30,40,50};

        for(int i = 0; i < anArray.length; i++){
            System.out.println(anArray[i]);
        }

        //For Each Loop
        int[] a = {60,70,80,90};

        for (int i: a){
            System.out.println(i);
        }

        //while loop
        int[] a1 = {100,200,300,400,500};
        int i = 0;
        while(i < a1.length){
            System.out.println(a1[i]);
            i++;
        }

        //do-while loop
        int[] a2 = {600,700,800,900};
        int l = 0;
        do{System.out.println(a2[l]);
            l++;
        } while(l < a2.length);

        
    }
        
}
