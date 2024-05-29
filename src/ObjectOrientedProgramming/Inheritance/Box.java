package ObjectOrientedProgramming.Inheritance;

public class Box {
    int length;
    int width;
    int height;

    //Default constructor that takes no arguments
    public Box(){
        this.length = 1;
        this.width = 2;
        this.height = 3;
    }

    //Constructor that takes 3 arguments
    public Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }



    public int findVolume(){
        return (length * width * height);
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("The volume of the box is : " + box1.findVolume() + " litres");
    }
}
