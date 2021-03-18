package homework.homethree.homefour;

public class Horse extends Animal {

    private String name;

    public Horse(String food, String location, String name) {

        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("You have awakened " + name);
    }

    @Override
    public void eat() {
        System.out.println("Horse " + name + " eats.");
    }

    @Override
    public void sleep() {
        System.out.println("Horse " + name + " sleep.");
    }

    public String getName() {

        return name;
    }
}
