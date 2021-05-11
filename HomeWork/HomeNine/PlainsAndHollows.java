package homework.HomeNine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlainsAndHollows {

    public static int enterInteger(Scanner scanner) {

        int number = 0;
        boolean check;

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

    public static int enterFieldElement(Scanner scanner) {

        int number = 0;
        boolean check;

        do {

            if (scanner.hasNextInt()) {

                number = scanner.nextInt();
               if (number == 0 || number == 1){

                    check = true;
                } else {

                    System.out.println("Was entered not a number, try again: ");
                    scanner.nextLine();
                    check = false;
                }
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        } while (!check);
        return number;
    }

    public static int hollowPassage(int x, int y, int[][] field, int length, int height, int lengthOfPassage, Integer lastDirection ) {

        int countOfRelatedHollows = 0; // countOfRelatedHollows - кол-во впадин вокруг нашей точки
        int newLengthOfPassage = lengthOfPassage;
        if (field[y][x] == 0) {

            lengthOfPassage++;
            newLengthOfPassage++;
            if (x < length - 1 && field[y][x + 1] == 0 && lastDirection != 1) { // справа 0?

                countOfRelatedHollows++;
                int newLastDirection = 2;
                newLengthOfPassage = hollowPassage(x + 1, y, field, length, height, newLengthOfPassage, newLastDirection);
            }
            if (x > 0 && field[y][x - 1] == 0 && lastDirection != 2) { // слева 0?

                countOfRelatedHollows++;
                int newLastDirection = 1;
                newLengthOfPassage = hollowPassage(x - 1, y, field, length, height, newLengthOfPassage, newLastDirection);
            }
            if (y < height - 1 && field[y + 1][x] == 0 && lastDirection != 3) { // снизу 0?

                countOfRelatedHollows++;
                int newLastDirection = 4;
                newLengthOfPassage = hollowPassage(x, y + 1, field, length, height, newLengthOfPassage, newLastDirection);
            }
            if (y > 0 && field[y - 1][x] == 0 && lastDirection != 4) { // сверху 0?

                countOfRelatedHollows++;
                int newLastDirection = 3;
                newLengthOfPassage = hollowPassage(x, y - 1, field, length, height, newLengthOfPassage, newLastDirection);
            }
            if (countOfRelatedHollows > 1) {

                return lengthOfPassage - 1;
            } else if (countOfRelatedHollows < 1) {

                return lengthOfPassage;
            }
        }
        return newLengthOfPassage;
    }

    public static StringBuilder printField(ArrayList<Integer> hollowsLength) {

        StringBuilder sizes = new StringBuilder();
        sizes.append("[ ");
        for (int i = 0; i < hollowsLength.size(); i++) {

            int currentElement = hollowsLength.get(i);
            if(hollowsLength.get(i + 1).equals(currentElement)) {

                sizes.append(currentElement).append(" ");
                hollowsLength.remove(i + 1);
            } else {

                sizes.append(currentElement).append(" ");
            }
        }
        sizes.append("]");
        return sizes;
    }

    public static ArrayList<Integer> printField(int[][] field, int fieldHeight, int fieldLength) {

        ArrayList<Integer> hollowsLength = new ArrayList<>();

        Integer lastDirection = 0; // направление где была предыдущая проверка, 1 или 2 или 3 или 4
        for (int i = 0; i < fieldHeight; i++) {

            for (int j = 0; j < fieldLength; j++) {

                int buffLengthOfHallow = hollowPassage(j, i, field, fieldLength, fieldHeight, 0, lastDirection);
                if (buffLengthOfHallow > 0) {

                    hollowsLength.add(buffLengthOfHallow);
                }

            }
        }
        Collections.sort(hollowsLength);
        return hollowsLength;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of matrix");
        int fieldHeight = enterInteger(scanner);
        System.out.println("Enter length of matrix");
        int fieldLength = enterInteger(scanner);
        int[][] field = new int[fieldLength][fieldHeight];
        for (int i = 0; i < fieldHeight; i++) {

            System.out.println("Enter " + (i + 1) + " line");
            for (int j = 0; j < fieldLength; j++) {

                field[i][j] = enterFieldElement(scanner);
            }
        }
        ArrayList<Integer> hollowsLength  = printField(field, fieldHeight, fieldLength);
        System.out.println(printField(hollowsLength));
    }
}
