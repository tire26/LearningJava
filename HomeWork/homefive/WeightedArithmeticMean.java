package homework.homefive;

import java.util.Scanner;

public class WeightedArithmeticMean {

    public static int enterInteger(Scanner scanner) {

        int number = 0;
        boolean check = false;

        while (!check) {

            if (scanner.hasNextInt()) {

                number = Integer.parseInt(scanner.nextLine());
                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        }
        return number;
    }

    public static void main(String[] args) {

        final byte positionNumInStrings = 3;
        Scanner scanner = new Scanner(System.in);
        int countOfMeans = 0;
        Double[] weightsOfValues, values;
        double topSum = 0, bottomSum = 0;
        String correctInput = "^(x: ([1-9]?[0-9]+)(.[0-9]*[1-9])?; p: ([1-9]?[0-9]+)(.[0-9]*[1-9])?)"
                + "|(x: ([1-9]?[0-9]*)(.[0-9]*[1-9])?)"
                + "|(p: ([1-9]?[0-9]+)(.[0-9]*[1-9])?; x: ([1-9]?[0-9]+)(.[0-9]*[1-9])?)$", buffer, currentP, currentX;
        char[][] separateInput;
        String[] XAndPStrings; // Массив двух строк для x и p
        boolean check = false;
        StringBuilder currentNumberX = new StringBuilder(), currentNumberP = new StringBuilder();

        System.out.print("Enter count of number: ");
        countOfMeans = enterInteger(scanner);
        values = new Double[countOfMeans];
        weightsOfValues = new Double[countOfMeans];
        separateInput = new char[countOfMeans][];

        System.out.println("Enter your values");
        for (int i = 0; i < countOfMeans; ++i) { // ввод значений
            check = false;
            while (!check) {

                buffer = scanner.nextLine();
                if (buffer.matches(correctInput)) { 

                    check = true;
                    XAndPStrings = buffer.split("(; )");
                    for (int j = 0; j < XAndPStrings.length; ++j) { // разбивание строки значения на 2 строки

                        separateInput[i] = XAndPStrings[j].toCharArray();
                        currentNumberX.delete(0, currentNumberX.length());
                        currentNumberP.delete(0, currentNumberP.length());
                        for (int k = 0; k < separateInput[i].length; ++k) { // проход по массиву символов обоих строк

                            if (separateInput[i][k] == 'x') { // если текущая строка  - значения

                                
                                for (int k2 = positionNumInStrings; k2 < separateInput[i].length; ++k2, ++k) { // считывание числа из массива строк
                                    
                                    currentNumberX.append(separateInput[i][k2]);
                                }
                                currentX = currentNumberX.toString();
                                try{
                                values[i] = Double.parseDouble(currentX);
                                } catch (NumberFormatException e) {
                                    System.out.println("Programm crashed");
                                }
                            } else if (separateInput[i][k] == 'p') {  // если текущая строка  - вес значения

                                
                                for (int k2 = positionNumInStrings; k2 < separateInput[i].length; ++k2, ++k) { // считывание числа из массива строк

                                    currentNumberP.append(separateInput[i][k2]);
                                }
                                currentP = currentNumberP.toString();
                                try {
                                weightsOfValues[i] = Double.parseDouble(currentP);
                                } catch (NumberFormatException e) {
                                    System.out.println("Programm crashed");
                                }
                            }
                        }
                    }
                } else {

                    System.out.println("Was entered wrong form, try again:");
                    check = false;
                }
            }
        }
        for (int i = 0; i < countOfMeans; ++i) {
            if (weightsOfValues[i] == null) {
                weightsOfValues[i] = 1.0;
            }
            topSum += weightsOfValues[i] * values[i];
            bottomSum += weightsOfValues[i];
        }
        System.out.format("%.3f",topSum / bottomSum);
    }
}
