package src.ru.mai.kaf;

public class Base {
    private int width;
    private int height;
    private int numberOfLegs;

    public Base(int width, int height, int numberOfLegs) {
        this.width = width;
        this.height = height;
        this.numberOfLegs = numberOfLegs;
    }

    public void print() {
        System.out.println(
                String.format("My width: %d \nMy height: %d\n My number of legs: %d", width, height, numberOfLegs));
    }
}