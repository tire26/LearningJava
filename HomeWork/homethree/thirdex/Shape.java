package homework.homethree.thirdex;

public abstract class Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public Shape (String color) {
        this.color = color;
    }

    public abstract void draw();

    public boolean equals(Shape obj1) {

        return (obj1.color == color);
    }
}
