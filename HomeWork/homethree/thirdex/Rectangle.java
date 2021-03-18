package homework.homethree.thirdex;

public class Rectangle extends Shape {

    private int x1, y1, x2, y2; // где x1,y1,x2, y1 координаты диагональных отчек

    public Rectangle(String color, int x1, int y1, int x2, int y2) {

        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getRectangleX1() {

        return x1;
    }

    public int getRectangleY1() {

        return y1;
    }

    public int getRectangleX2() {

        return x2;
    }

    public int getRectangleY2() {

        return y2;
    }

    public void draw() {

    }

    public boolean equals(Rectangle obj) {

        return (obj.x1 == x1 & obj.y1 == y1 & obj.x2 == x2 & obj.y2 == y2);
    }
}
