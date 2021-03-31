package homework.homefive;

import java.util.Scanner;

public class Inflation {

    public static Double calculation(double coast, double inflation) {

        final byte maxPercent = 100;
        double result = 0.0;

        result = coast * (maxPercent + inflation) / maxPercent;
        return result;
    }

    public static Double enterDouble(Scanner scanner) {
        double checkNumber = 0.0;
        boolean check = false;

        do {

            if (scanner.hasNextDouble()) {

                checkNumber = scanner.nextDouble();
                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        } while (!check);
        return checkNumber;
    }

    public static int enterInteger(Scanner scanner) {

        int number = 0;
        boolean check = false;

        do {

            if (scanner.hasNextInt()) {

                number = scanner.nextInt();
                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        } while (!check);
        return number;
    }

    public static void main(String[] args) {
        double startCoast = 0, startIflation = 0, totalCoast = 0, totalIflation = 0;
        Double[] inflations;
        int howManyMonths;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start coas of product: ");
        startCoast = enterDouble(scanner);
        System.out.print("Enter start inflation: ");
        startIflation = enterDouble(scanner);
        System.out.print("Enter count of months: ");
        howManyMonths = enterInteger(scanner);
        System.out.println("Enter inflation for each month:");
        inflations = new Double[howManyMonths];
        totalCoast = startCoast;
        totalIflation = startIflation;
        for (int i = 0; i < howManyMonths; i++) {

            inflations[i] = enterDouble(scanner);
            totalIflation += inflations[i];
            totalCoast = calculation(totalCoast, totalIflation);
        }
        if (totalCoast <= 0) {

            totalCoast = 0.0;
            System.out.println("Economic crash");
        }
        System.out.format("%.2f", totalCoast);
    }
}