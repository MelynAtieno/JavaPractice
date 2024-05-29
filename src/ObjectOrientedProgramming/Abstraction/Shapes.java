package ObjectOrientedProgramming.Abstraction;

public class Shapes {

    int radius;
    int base;
    int width;
    int height;


    public Shapes(){
        this.base = 2;
        this.radius = 2;
        this.width = 2;
        this.height = 2;
    }

    public void findArea(){
        System.out.println("Area : " + width * height);
    }
}
