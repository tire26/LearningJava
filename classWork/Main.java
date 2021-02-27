package classWork;

public class Main {
    public static void main(String[] args) {
        /*Box emptyBox = new Box();

        System.out.println("Empty box has volume " + emptyBox.getVolume());
        System.out.println("Empty box =" + emptyBox);
        System.out.println("Empty box =" + emptyBox.toString());

        Box box = new Box(1, 2, 3);
        System.out.println("Box has width " + box.getWidth());
        System.out.println("box has volume " + box.getVolume());

        Container defContainer = new Container();
        System.out.println("Def container has volume =" + defContainer.getVolume());

        Container container = new Container(2, 3, 4, 5);
        // System.out.println("Container has volume =" + container.getVolume());
        // System.out.println("Container has weight =" + container.getWeight());
        // System.out.println("Container has width =" + container.getWidth());
        container.print();

        Box castBox = new Container(10, 10, 20, 10);
        double weight = ((Container) castBox).getWeight();
        System.out.println(weight);

        System.out.println();

        castBox.print();*/

        /*Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animals = new Animal[] { cat,  dog};

        for (Animal animal : animals) {
            animal.voice();
            animal.run();
            animal.walk();
        }

        Cow cow = new Cow();
        Sound[] sounds = new Sound[] {cat, dog, cow};
        for (Sound sound : sounds){
            sound.voice();
            if (sound instanceof Animal){
                ((Animal) sound).run();
            } else if (sound instanceof Cow) {
                ((Cow) sound).run();
            }
        }*/

        Cat cat = new Cat("Pushok");
        Dog dog = new Dog("Muchtar");
        Cow cow = new Cow("Sharik");

        Feeder feeder = new Feeder();
        feeder.feed(cat);
        feeder.feed(dog);
        feeder.feed(cow);
    }
}
