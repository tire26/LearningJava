package homework.homefour;

import java.util.Scanner;
import java.lang.Math;

public class SecondEx {

    public static void main(String[] args) {

        final byte xCoordinate = 0, yCoordinate = 1, numOfXY = 2;
        int[][] pointsArray;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        String[] points = new String[] {};
        int countOfPoints = 0, PositionXOrY = 0;
        String checkInput = "^\\([-0-9]*, [-0-9]*\\)$", buffer, checkContentsNums = "^[-0-9]+|[0-9]+$";
        double maxAreaOfTriangle = 0, halfPerimeter = 0, firstSize = 0, secondSize = 0, thirdSize = 0,
                areaOfTriangle = 0;

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
        pointsArray = new int[countOfPoints][numOfXY];
        for (int i = 0; i < countOfPoints; i++) {

            System.out.println("Enter coordinate of point: ");
            buffer = scanner.nextLine();
            check = false;
            while (!check) {

                if (buffer.matches(checkInput)) {

                    check = true;
                    points = buffer.split("[,() ]");
                    PositionXOrY = 0;
                    // здесь заполняем двумерный массив координат, введено
                    // k, так как после split, размер массива points > 3, а
                    // значений для xy - 2
                    for (int pointsArrayElement = 0; pointsArrayElement < points.length; pointsArrayElement++) {

                        if (points[pointsArrayElement].matches(checkContentsNums)) {

                            pointsArray[i][PositionXOrY] = Integer.parseInt(points[pointsArrayElement]);
                            PositionXOrY++;
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
        for (int firstPoint = 0; firstPoint < countOfPoints; firstPoint++) { // берём 1 точку треугольника

            for (int secondPoint = 0; secondPoint < countOfPoints; secondPoint++) { // берём 2 точку треугольника

                for (int thirdPoint = 0; thirdPoint < countOfPoints; thirdPoint++) { // берём 3 точку треугольника

                    if (thirdPoint != firstPoint & thirdPoint != secondPoint & secondPoint != firstPoint) {
                        firstSize = Math.sqrt(Math
                                .pow(pointsArray[firstPoint][xCoordinate] - pointsArray[secondPoint][xCoordinate], 2)
                                + Math.pow(pointsArray[firstPoint][yCoordinate] - pointsArray[secondPoint][yCoordinate],
                                        2));
                        secondSize = Math.sqrt(Math
                                .pow(pointsArray[secondPoint][xCoordinate] - pointsArray[thirdPoint][xCoordinate], 2)
                                + Math.pow(pointsArray[secondPoint][yCoordinate] - pointsArray[thirdPoint][yCoordinate],
                                        2));
                        thirdSize = Math.sqrt(Math
                                .pow(pointsArray[firstPoint][xCoordinate] - pointsArray[thirdPoint][xCoordinate], 2)
                                + Math.pow(pointsArray[firstPoint][yCoordinate] - pointsArray[thirdPoint][yCoordinate],
                                        2));
                        halfPerimeter = (firstSize + secondSize + thirdSize) / 2;
                        if (halfPerimeter < firstSize | halfPerimeter < secondSize | halfPerimeter < thirdSize) {

                            areaOfTriangle = 0;
                        } else {

                            areaOfTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - firstSize)
                                    * (halfPerimeter - secondSize) * (halfPerimeter - thirdSize));
                        }
                        if (firstPoint == 0 & secondPoint == 1 & thirdPoint == 2) { // самый первый проверяемый
                                                                                    // треугольник возьмём как самый
                                                                                    // большой

                            maxAreaOfTriangle = areaOfTriangle;
                            areaOfTriangle = 0;
                        } else if (areaOfTriangle >= maxAreaOfTriangle) {

                            maxAreaOfTriangle = areaOfTriangle;
                            areaOfTriangle = 0;
                        } else {

                            areaOfTriangle = 0;
                        }
                    }
                }
            }
        }

        System.out.format("%.2f\n", maxAreaOfTriangle);
    }
}
