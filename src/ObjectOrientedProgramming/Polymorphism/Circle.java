package ObjectOrientedProgramming.Polymorphism;

public class Circle extends Shapes {

    public void findArea(){
        System.out.println("Area : " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.findArea();
    }
}
