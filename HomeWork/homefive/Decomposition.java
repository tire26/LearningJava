package homework.homefive;

import java.util.Scanner;

public class Decomposition {

    public static int enterInteger(Scanner scanner) {

        int number = 0;
        boolean check = false;

        while (!check) {

            if (scanner.hasNextInt()) {

                number = scanner.nextInt();
                if (number >= 0) {
                    check = true;
                } else {

                    System.out.println("Was entered number less than 0, try again: ");
                    scanner.nextLine();
                    check = false;
                }
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        }
        return number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k = 0, cycle = 0;

        System.out.print("Entere your number: ");
        k = enterInteger(scanner);
        System.out.println(k);
        for (cycle = 0; k > 0; cycle++) {

            k -= cycle;
            System.out.println("now k : " + k);
        }
        if (k == 0) {
            System.out.println(true);
            System.out.println(cycle - 1);
        } else {
            System.out.println(false);
        }
    }
}
