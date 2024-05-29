package ObjectOrientedProgramming.Inheritance;

public class BoxWeight extends Box{

    int weight;

    public BoxWeight(){
        this.weight = 15;
    }


    public static void main(String[] args) {
        BoxWeight boxWeight1 = new BoxWeight();
        System.out.println("Volume : " + "Weight : " + boxWeight1.weight + " grams");
    }
}
