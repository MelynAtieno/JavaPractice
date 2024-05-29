package ObjectOrientedProgramming.Polymorphism;

public class Square extends Shapes {

    void findArea() {
        System.out.println("Area : " + (width * width));
    }

    public static void main(String[] args) {
        Square square1 = new Square();
        square1.findArea();
    }
}
