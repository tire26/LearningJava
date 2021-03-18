package homework.homethree.firstex;

public class Product {
    String name;
    int coast;
    int rating;

    public Product(String name, int coast, int rating) {
        this.name = name;
        this.coast = coast;
        this.rating = rating;
    }

    public String getName() {

        return name;
    }

    public int coast() {

        return coast;
    }

    public double rating() {

        return rating;
    }
}
