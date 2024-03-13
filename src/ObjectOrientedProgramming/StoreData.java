package ObjectOrientedProgramming;

public class StoreData {
    public static void main(String args[]) {
        // create a datatype that stores 5 whole numbers
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students. (adm no, name, marks)
        int[] admno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        //create a class
        //for every single student

        //constructor
        //Student kunal = new Student(); // calls the empty constructor
        Student kunal = new Student(15, "Kunal", 88);
        Student rahul = new Student(18, "Rahul", 95);

    }
}
        class Student{
            int admno;
            String name;
            float marks;

            //constructor function to create a new object
            //if an object is created, it goes into the constructor

            // "this" is used to access every object
            Student (int admno, String name, float marks){
                this.admno = admno;
                this.name = name;
                this.marks = marks;

            }
            //empty constructor
//            Student (){
//                this.admno = 13;
//                this.name = "Kunal";
//                this.marks= 80;
//            }

            //call a constructor from another constructor
            Student(){
                //internally is sth like: new Student()
                this(7, "Sara", 67);
            }

            Student(Student other){
                this.admno = other.admno; // kunal.admno = rahul.admno
                this.name = other.name;
                this.marks = other.marks;
            }





}
