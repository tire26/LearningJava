
import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;
}



public class Test {

    public static int enterInteger(Scanner scanner) {

        int number = 0;
        boolean check = false;
    
        while (!check) {
    
            if (scanner.hasNextInt()) {
    
                number = scanner.nextInt();
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
        Scanner scanner = new Scanner(System.in);
        StringBuilder sum = new StringBuilder("adasdasdasd");
        String b, c;
        int a = 0;
        double sum1 = 0;
        boolean check = false;

        // b = scanner.nextLine();
        // sum1 = Double.parseDouble(b);
        // System.out.println(sum1);
        a = enterInteger(scanner);

        b = scanner.nextLine();
    //     while (!check) {

    //         if (scanner.hasNextDouble()) {

    //             sum1 = Double.parseDouble(scanner.nextLine());
    //             check = true;
    //         } else {

    //             System.out.println("Was entered not a number, try again: ");
    //             scanner.nextDouble();
    //             check = false;
    //         }
    //     }

    }
}
