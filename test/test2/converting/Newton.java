package test.test2.converting;

public class Newton {

    private static final double differentFromCesya = 0.33;

    private double degree;

    public Newton(double degree) {

        this.degree = degree;
    }
    public static double GetDifferentFromCesya() {

       return differentFromCesya;
    }

    public void converting(double degree) {

        degree *= differentFromCesya;
        System.out.println(degree);
    }
}
