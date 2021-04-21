package test.fibbanachi;

import java.util.Scanner;

public class Fibbanachi {

    public static void main(String[] args) {

        final int valueOfFirstElement = 0, valueOfSecondElement = 1, posOfFirstElement = 0, posOfSecondElement = 1;

        int[] fibbanachiList;
        Scanner scanner = new Scanner(System.in);
        int firstPosNum, secondPosNum;
        StringBuilder buffer = new StringBuilder();
        firstPosNum = scanner.nextInt();
        secondPosNum = scanner.nextInt();
        fibbanachiList = new int[secondPosNum + 2];
        fibbanachiList[posOfFirstElement] = valueOfFirstElement;
        fibbanachiList[posOfSecondElement] = valueOfSecondElement;
        for (int i = -1; i < secondPosNum; ++i) {

            if (i >= 2) {
                fibbanachiList[i] = fibbanachiList[i - 1] + fibbanachiList[i - 2];
            }
            if (i >= firstPosNum) {

                buffer.append(fibbanachiList[i]).append(" ");
            }
        }
        System.out.println(buffer);
    }

}
