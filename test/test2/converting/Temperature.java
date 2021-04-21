package test.test2.converting;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        String enteredDegree;
        double firstTemperature;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start temperature");
        firstTemperature = scanner.nextDouble();
        System.out.println("Enter in what degree need to convert");
        scanner.nextLine();
        enteredDegree = scanner.nextLine();

        Newton newton = new Newton(firstTemperature);
        Kelvin kelvin = new Kelvin(firstTemperature);
        Fahrenheit fahrenheit = new Fahrenheit(firstTemperature);
        switch (enteredDegree) {
            case "N" -> newton.converting(firstTemperature);
            case "K" -> kelvin.converting(firstTemperature);
            case "F" -> fahrenheit.converting(firstTemperature);
        }
    }
}
