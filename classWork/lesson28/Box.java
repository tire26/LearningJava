package classWork.lesson28;

public class Box{
    double width;
    double height;
    double depth;

    public Box() {
        
    }
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getDepth() {
        return depth;
    }
    public double getVolume() {
        return width * height * depth;
    }
    public void print() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height); 
        System.out.println("Depth: " + depth);
    }
}