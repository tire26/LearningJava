package test;

import java.util.Scanner;

import java.lang.Math;

public class AreaEx {
    public static void main(String[] args) {
        final byte COEFHALFPERIMETR = 2;
        byte countOfPoints = 0;
        int i = 0;
        Double[] lengtOfSide;
        double perimeter = 0;
        int[] coordinatesX, coordinatesY;
        Scanner input = new Scanner(System.in);

        countOfPoints = input.nextByte();
        coordinatesX = new int[countOfPoints];
        coordinatesY = new int[countOfPoints];
        lengtOfSide = new Double[countOfPoints];
        for (i = 0; i < countOfPoints; i++) {
            coordinatesX[i] = input.nextInt();
            coordinatesY[i] = input.nextInt();
        }
        input.close();
        for (i = 0; i < countOfPoints; i++) {
            lengtOfSide[i] = (double) (Math.sqrt(Math.pow(coordinatesX[i + 1] - coordinatesX[i], 2) + Math.pow(coordinatesY[i + 1] - coordinatesY[i], 2)));
            perimeter += lengtOfSide[i] / COEFHALFPERIMETR;
        }
        for (i = 0; i < countOfPoints; i++) {
            
        }
        
    }
}
