package homework.homethree.HomeTwo;

import java.util.Scanner;

public class FirstEx {
    public static void main(String[] args) {
        Scanner in;
        double middleMean = 0.0, sumAllLetters = 0;
        int numOfLetters = 0;
        char[] str;

        System.out.print("Entere your string: ");
        in = new Scanner(System.in);
        str = in.nextLine().toCharArray(); // Здесь вводимая строка разбивается на массив символов
        in.close();
        numOfLetters = str.length;
        for (int i = 0; i < numOfLetters; i++) { // Здесь все кодовые значения символов сумируются
            sumAllLetters += (int) str[i];
        }
        middleMean = sumAllLetters / numOfLetters;
        System.out.println("Middle of code value: " + middleMean);
    } 
}
