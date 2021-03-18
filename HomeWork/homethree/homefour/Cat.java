package homework.homethree.homefour;

public class Cat  extends Animal{

    private String name;

    public Cat(String food, String location, String name) {

        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("You have awakened " + name);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + name + " eats.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + name + " sleep.");
    }

    public String getName() {

        return name;
    }
}
