package ObjectOrientedProgramming.Inheritance;

public class BoxWeight extends Box{

    int weight;

    public BoxWeight(){
        this.weight = 15;
    }

    //Constructor that takes four arguments
    public BoxWeight(int length, int width, int height, int weight){
        super(length,width,height); //call the superclass constructor
        this.weight = weight;
    }


    public static void main(String[] args) {
        BoxWeight boxWeight1 = new BoxWeight();
        System.out.println("Volume : " + boxWeight1.findVolume() + " litres " + "Weight : " + boxWeight1.weight + " grams");

        BoxWeight box2 = new BoxWeight(1,2,5,20);
        System.out.println("Volume : " + box2.findVolume() + " litres " + "Weight : " + box2.weight + " grams");
    }
}
