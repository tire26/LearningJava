
import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sum = new StringBuilder("");
        String b, c;
        int a = 0;
        double sum1 = 0;
        boolean check = false;

        b = scanner.nextLine();
        sum1 = Double.parseDouble(b);
        System.out.println(sum1);

        while (!check) {

            if (scanner.hasNextDouble()) {

                sum1 = Double.parseDouble(scanner.nextLine());
                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextDouble();
                check = false;
            }
        }

    }
}
