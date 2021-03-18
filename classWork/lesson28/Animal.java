package classWork.lesson28;

public abstract class Animal implements Sound, MeanOfTransport {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();

    public void walk() {
        System.out.println("I am walking");
    }

    public void run() {
        System.out.println("I am running");
    }

    public String getName() {
        return name;
    }
}
