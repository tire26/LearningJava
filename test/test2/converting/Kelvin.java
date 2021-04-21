package test.test2.converting;

public class Kelvin {

    private static final double differentFromCesya = 273.15;

    private double degree;

    public Kelvin(double degree) {

        this.degree = degree;
    }

    public static double GetDifferentFromCesya() {

        return differentFromCesya;
    }

    public void converting(double degree) {

        degree += differentFromCesya;
        System.out.println(degree);
    }
}
