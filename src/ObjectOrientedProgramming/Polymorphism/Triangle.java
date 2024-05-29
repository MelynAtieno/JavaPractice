package ObjectOrientedProgramming.Polymorphism;

public class Triangle extends Shapes {

    public void findArea(){
        System.out.println("Area : " + ((0.5) * base * height));
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.findArea();
    }
}
