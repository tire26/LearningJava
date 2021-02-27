package classWork;

public class Container extends Box{
    double weight;

    public Container() {
        super(3, 4, 5);
    }

    public Container(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("weight " + weight);
    }
}
