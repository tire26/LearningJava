package classWork.lesson28;

public class Cow implements Sound {
    
    private String name;

    public Cow(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("My-y");
    }
    public void run() {
        System.out.println("i am running");
    }
    public void walk() {
        System.out.println("I am walking");
    }
}
