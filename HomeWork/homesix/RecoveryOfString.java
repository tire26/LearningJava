package homework.homesix;

import java.util.Objects;
import java.util.Scanner;

public class RecoveryOfString {

    public static void main(String[] args) {

        String checkFirstString = "^([a-zA-Zа-яА-ЯёЁ ]+:\\d+;)*([a-zA-Zа-яА-ЯёЁ ]+:\\d+)$",
                checkSecondString = "^((\\d+)(-\\d+)*)$";

        Scanner scanner = new Scanner(System.in);
        boolean check;

        System.out.println("Enter first string");
        String firstString;
        do {

            firstString = scanner.nextLine();
            if (firstString.matches(checkFirstString)) {

                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        } while (!check);

        System.out.println("Enter second string");
        String secondString;
        do {

            secondString = scanner.nextLine();
            if (secondString.matches(checkSecondString)) {

                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                check = false;
            }
        } while (!check);
        scanner.close();
        String[] firstSepString = firstString.split(";");
        String[] secondSepString = secondString.split("-");
        String[] totalString = new String[secondSepString.length];

        for (String str1 : firstSepString) {

            String[] buffer = str1.split(":");
            for (int i = 0; i < secondSepString.length; ++i) {

                if (secondSepString[i].equals(buffer[1])) {

                    totalString[i] = buffer[0];
                }
            }

        }
        for (String s : totalString) {
            System.out.print(Objects.requireNonNullElse(s, "_"));
        }
    }
}