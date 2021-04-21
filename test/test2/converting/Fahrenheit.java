package test.test2.converting;

public class Fahrenheit implements  Convertor{

    private static final double differentFromCesya = 32.00;

    private double degree;

    public Fahrenheit(double degree) {

        this.degree = degree;
    }

    public static double GetDifferentFromCesya() {

        return differentFromCesya;
    }

    public void converting(double degree) {

        degree = (9 * degree) / 5 + differentFromCesya;
        System.out.println(degree);
    }
}
