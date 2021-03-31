package homework.homefour;

import java.util.Scanner;
import java.lang.Math;

public class FirstEx {

    public static void main(String[] args) {

        final byte xCoordinate = 0, yCoordinate = 1, zCoordinate = 2;
        int[][] pointsArray;
        Scanner scanner = new Scanner(System.in);
        String checkInput = "^\\([-0-9]*, [-0-9]*, [-0-9]*\\)$", buffer, checkContentsNums = "^-[0-9]+|[0-9]+$";
        String[] points = new String[] {};
        int countOfPoints = 0, numberOfPointWithMinSum = 0, k = 0;
        boolean check = false;
        double minDistanceToPoints = 0.0, bufferForSum = 0.0;
        StringBuffer totalString = new StringBuffer();

        System.out.print("Enter count of point: ");
        while (!check) {

            if (scanner.hasNextInt()) {

                countOfPoints = Integer.parseInt(scanner.nextLine());
                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        }
        pointsArray = new int[countOfPoints][3];

        for (int i = 0; i < countOfPoints; i++) {

            System.out.println("Enter coordinate of point: ");
            buffer = scanner.nextLine();
            check = false;
            while (!check) {

                if (buffer.matches(checkInput)) {

                    check = true;
                    points = buffer.split("[,() ]");
                    k = 0;
                    for (int j = 0; j < points.length; j++) { // здесь мы заполняем двумерный массив координат, введено
                                                              // k, так как после split, размер массива points > 3, а
                                                              // значений для xyz - 3

                        if (points[j].matches(checkContentsNums)) {

                            pointsArray[i][k] = Integer.parseInt(points[j]);
                            k++;
                        }
                    }
                } else {

                    System.out.println("Was entered wrong coordinate, try again: ");
                    scanner.nextLine();
                    check = false;
                }
            }
        }
        scanner.close();
        for (int i = 0; i < countOfPoints; i++) {

            for (int j = 0; j < countOfPoints; j++) {

                bufferForSum += Math.sqrt(Math.pow(pointsArray[i][xCoordinate] - pointsArray[j][xCoordinate], 2)
                        + Math.pow(pointsArray[i][yCoordinate] - pointsArray[j][yCoordinate], 2)
                        + Math.pow(pointsArray[i][zCoordinate] - pointsArray[j][zCoordinate], 2));
            }
            if (i == 0) {

                minDistanceToPoints = bufferForSum;
                numberOfPointWithMinSum = i;
                bufferForSum = 0;
            } else if (bufferForSum <= minDistanceToPoints) {

                numberOfPointWithMinSum = i;
                minDistanceToPoints = bufferForSum;
                bufferForSum = 0;
            } else {

                bufferForSum = 0;
            }
        }
        totalString.append("(");
        totalString.append(pointsArray[numberOfPointWithMinSum][0]);
        totalString.append(", ");
        totalString.append(pointsArray[numberOfPointWithMinSum][1]);
        totalString.append(", ");
        totalString.append(pointsArray[numberOfPointWithMinSum][2]);
        totalString.append(") ");
        System.out.print(totalString);
        System.out.format("%.2f", minDistanceToPoints);
    }
}
