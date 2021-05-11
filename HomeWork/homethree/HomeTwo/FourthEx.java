package homework.homethree.HomeTwo;

import java.util.Scanner;

public class FourthEx {
    public static void main(String[] args) {
        final int numOfEntries = 10, maxMean = 10, minMean = 0, turnToAsci = 65;
        int buffer = 0;
        char letter;
        boolean check = false;
        Scanner input = new Scanner(System.in);
        StringBuilder string = new StringBuilder();

        System.out.println("Entere your nums");

        for (int i = 0; i < numOfEntries; i++) {
            do { // в цикде происходит ввод, и если что-то не так, то есть возможность ввести число ещё раз
                if (input.hasNextInt()) {
                    buffer = input.nextInt();
                    if (buffer >= minMean & buffer < maxMean) {
                        check = true;
                    } else {
                        System.out.println("Was entered number that is larger than should be, try again: ");
                        check = false;
                    }
                } else {
                    System.out.println("Was entered not a number, try again: ");
                    check = false;
                }
            } while (!check);
            letter = (char) (buffer + turnToAsci);
            string.append(letter);
        }
        input.close();
        System.out.println(string);
    }
}
