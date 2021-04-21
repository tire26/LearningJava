package homework.homefive;

import java.util.Scanner;

public class WeightedArithmeticMean {

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

        final int positionNumInStrings = 3;
        Scanner scanner = new Scanner(System.in);
        int countOfMeans = 0;
        double[] weightsOfValues, values;
        double topSum = 0, bottomSum = 0;
        String correctInput = "^(x: (-?[0-9]+(\\.[0-9]*[1-9]{1})?); p: (-?[0-9]+(\\.[0-9]*[1-9]{1})?))"
                + "|(x: (-?[0-9]+(\\.[0-9]*[1-9]{1})?))"
                + "|(p: (-?[0-9]+(\\.[0-9]*[1-9]{1})?); x: (-?[0-9]+(\\.[0-9]*[1-9]{1})?))$";
        boolean check = false;

        System.out.print("Enter count of number: ");
        countOfMeans = enterInteger(scanner);
        values = new double[countOfMeans];
        weightsOfValues = new double[countOfMeans];

        System.out.println("Enter your values");
        for (int i = 0; i < countOfMeans; ++i) { // ввод значений

            check = false;
            do {

                String buffer = scanner.nextLine();
                if (buffer.matches(correctInput)) {

                    String[] xAndPStrings; // Массив двух строк для x и p
                    check = true;
                    xAndPStrings = buffer.split("; ");
                    for (int j = 0; j < xAndPStrings.length; ++j) { // разбивание строки значения на 2 строки
                        if (xAndPStrings[j].contains("x")) { // если текущая строка - значения

                            String currentX = xAndPStrings[j].substring(positionNumInStrings);
                            try {

                                values[i] = Double.parseDouble(currentX);
                            } catch (NumberFormatException e) {

                                System.out.println("Programm crashed");
                            }
                        } else if (xAndPStrings[j].contains("p")) { // если текущая строка - вес значения

                            String currentP = xAndPStrings[j].substring(positionNumInStrings);
                            try {

                                weightsOfValues[i] = Double.parseDouble(currentP);
                            } catch (NumberFormatException e) {

                                System.out.println("Programm crashed");
                            }
                        }
                    }
                } else {

                    System.out.println("Was entered wrong form, try again:");
                    check = false;
                }
            } while (!check);
        }
        for (int i = 0; i < countOfMeans; ++i) {
            if (weightsOfValues[i] == 0) {
                weightsOfValues[i] = 1.0;
            }
            topSum += weightsOfValues[i] * values[i];
            bottomSum += weightsOfValues[i];
        }
        System.out.format("%.3f", topSum / bottomSum);
    }
}
