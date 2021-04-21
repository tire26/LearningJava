package homework.homesix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ASubsetOfTheLargest {

    private static final String NUM_REGEX = "^[0-9]*(\\.[0-9]+)?$";

    public static boolean isCommand(String command) {

        return command.equals("0");
    }

    public static Double enterListAndReturnMiddleSize(Scanner scanner, ArrayList<Double> listOfNums) {
        String buffer;
        boolean check;
        double middleSize = 0.0, currentNumber;

        do {
            System.out.println("Enter your num or command \"0\"");
            buffer = scanner.nextLine();
            if (isCommand(buffer)) {

                check = true;
            } else if (buffer.matches(NUM_REGEX)) {

                currentNumber = Double.parseDouble(buffer);
                listOfNums.add(currentNumber);
                middleSize += currentNumber;
                check = false;
            } else {

                System.out.println("Was entered not a number, try again: ");
                check = false;
            }
        } while (!check);

        if (listOfNums.size() == 0) {

            System.out.println("There is not any nums");
            return 0.0;
        } else {

            return middleSize / (double) listOfNums.size();
        }
    }

    public static void main(String[] args) {

        HashSet<Double> totalString = new HashSet<>(); // сюда скалдываются подходящие элементы, повторов не будт благодаря HashSet
        double middleSize;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> listOfNums = new ArrayList<>();

        middleSize = enterListAndReturnMiddleSize(scanner, listOfNums);

        if (middleSize > 0) {
            Collections.sort(listOfNums); // сортировка по коллекции по убыванию
            System.out.println("Middle size of yours list is: " + middleSize);
            for (Double listOfNum : listOfNums) { // вывод чисел, больших ср. значения и только в единственном экземпляре

                if (listOfNum > middleSize && totalString.add(listOfNum)) { // если число больше ср. значение и ещё не было выведено такое же

                    System.out.println(listOfNum);
                }
            }
        }
    }
}
