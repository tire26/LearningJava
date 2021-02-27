package classWork;

public class Feeder {
    public void feed(Cow cow){
        System.out.println("Cow is fed");
    }

    public void feed(Animal animal){
        System.out.println(animal.getName() + " is fed");
    }
}
