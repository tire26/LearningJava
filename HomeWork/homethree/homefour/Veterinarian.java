package homework.homethree.homefour;

public  class Veterinarian {
    

    static void treatAnimal (Animal animal) {

        StringBuilder sb = new StringBuilder(); 
        sb.append("Animal eats ");
        sb.append(animal.getFood());
        sb.append(", location of animal: ");
        sb.append(animal.getLocation());
        System.out.println(sb);
    }
}
