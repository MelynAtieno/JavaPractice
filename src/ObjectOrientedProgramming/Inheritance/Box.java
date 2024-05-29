package ObjectOrientedProgramming.Inheritance;

public class Box {
    int length;
    int width;
    int height;

    public Box(){
        this.length = 1;
        this.width = 2;
        this.height = 3;
    }



    public int findVolume(){
        return (length * width * height);
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("The volume of the box is : " + box1.findVolume() + " litres");
    }
}
