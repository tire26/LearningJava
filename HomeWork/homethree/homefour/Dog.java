package homework.homethree.homefour;

public class Dog extends Animal {
    private String name;

    public Dog(String food, String location, String name) {

        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("You have awakened " + name);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + name + " eats.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog " + name + " sleep.");
    }

    public String getName() {

        return name;
    }
}
