package homework.homefive;

import java.util.Scanner;

public class RootMeanSquareDeviation {
    
    public static double enterDouble(Scanner scanner) {
        double checkNumber = 0.0;
        boolean check = false;

        while (!check) {

            if (scanner.hasNextDouble()) {

                checkNumber = scanner.nextDouble();
                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        }
        return checkNumber;
    }

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
        int countOfnumber = 0;
        double[] numbers;
        double rootMeanSquareDeviation = 0, middleValue = 0;
        
        System.out.print("Enter count of number: ");
        countOfnumber = enterInteger(scanner);
        numbers = new double[countOfnumber];


        System.out.println("Enter numbers");
        for (int i = 0; i < countOfnumber; ++i) {

            numbers[i] =  enterDouble(scanner);
            middleValue += numbers[i];
        }
        middleValue /= countOfnumber;

        for (int i = 0; i < countOfnumber; ++i) {
            
            rootMeanSquareDeviation += Math.pow(numbers[i] - middleValue, 2); 
        }
        rootMeanSquareDeviation = Math.sqrt(rootMeanSquareDeviation / countOfnumber);
        System.out.format("%.3f", rootMeanSquareDeviation);
    }
}
