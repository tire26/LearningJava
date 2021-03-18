package homework.homethree.thirdex;

public class Circle extends Shape {

    private int xRadius, yRadius, radius;

    public Circle(String color, int xRadius, int yRadius, int radius) {

        super(color);
        this.xRadius = xRadius;
        this.yRadius = yRadius;
        this.radius = radius;
    }

    public int getCircleRadius()  {

        return radius;
    }

    public int getCircleXRadius()  { 

        return xRadius; 
    }

    public int getCircleYRadius()  { 
        
        return yRadius; 
    }

    public void draw() {

    }

    public boolean equals(Circle obj) {

        return (obj.radius == radius & obj.xRadius == xRadius & obj.yRadius == yRadius);
    }
}
