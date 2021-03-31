package lr.labaone.lrTwo;

import java.util.Scanner;

public class LrTwo {
    public static void main(String[] args) {
        Scanner in;
        int numOfEntries = 0, i, middleSize = 0, check = 0;
        String[] str;
        int[] stringsSize;
        System.out.println("Entere count of strings");
        do { 
            in = new Scanner(System.in);
            if (in.hasNextInt()) {
                numOfEntries = in.nextInt();
                System.out.println("Was entered number:" + numOfEntries);
                check = 1;
            } else {
                System.out.print("Was entered not a number, try again: ");
            }
        } while (check == 0);
        str = new String[numOfEntries];
        stringsSize = new int[numOfEntries];

        for (i = 0; i < numOfEntries; i++) { // ввод строк и подсчёт их средней длины
            System.out.println("Entere string " + (i + 1) + ":");
            in = new Scanner(System.in);
                str[i] = in.nextLine();
                stringsSize[i] = str[i].length();
                middleSize += str[i].length();
        }

        in.close();
        middleSize /= numOfEntries;
        System.out.println("middle length:" + middleSize);

        for (i = 0; i < numOfEntries; i++) { // вывод строк, длинна которых меньше либо равна средней

            if (str[i].length() <= middleSize) {
                System.out.println(str[i] + " | length:" + stringsSize[i]);
            }
        }
    }
}