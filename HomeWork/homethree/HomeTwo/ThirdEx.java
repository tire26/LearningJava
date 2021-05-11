package homework.homethree.HomeTwo;

import java.util.Scanner;

public class ThirdEx {
    public static void main(String[] args) {
        final byte numOfEntries = 3;
        float sum = 0, difference = 0, sumWhole = 0, buffer = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numOfEntries; i++) {
            System.out.print("Enter number: ");
            buffer = in.nextFloat();
            sum += buffer;
            sumWhole += (int) buffer;
        }
        difference = sum - sumWhole;
        System.out.format("Sum: " + sum + "\nSumWhole: " + sumWhole + "\nDifference betwen sums: " + difference);
        in.close();
        
    }
}
