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

        //switch statement
        int month = 3;
        String monthName;
         switch (month) {
            case 1: monthName = "January";
            break;
            case 2: monthName = "February";
            break;
            case 3: monthName = "March";
            break;
            case 4: monthName = "April";
            break;
            case 5: monthName = "May";
            break;
            case 6: monthName = "June";
            break;
            case 7: monthName = "July";
            break;
            case 8: monthName = "August";
            break;
            case 9: monthName = "September";
            break;
            case 10: monthName = "October";
            break;
            case 11: monthName = "November";
            break;
            case 12: monthName = "December";
            break;
            default: monthName= "Invalid Month";
            
         }
         System.out.println(monthName);

         //switch statement arrow version
         int love = 2;
         String fruit;
         switch (love) {
            case 1 -> fruit = "Apple";
            case 2 -> fruit = "Pear";
            case 3 -> fruit = "Banana";
            default -> fruit = "Invalid fruit";
            
         };
         System.out.println(fruit);

         //switch expression
         int gender = 7;
         String ask = switch(gender){
            case 1 -> "Male";
            case 2 -> "Female";
            case 3 -> "Transgender";
            case 4 -> "Non-binary";
            default -> "Invalid gender";
         };
         System.out.println(ask);

        
    }
        
}
