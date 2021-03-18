package test;

import java.util.Scanner;


public class MKADEx {
    public static void main(String[] args) {
        final int mkadLength = 109;
        int speed = 0, time = 0, totalWay = 0, stopMark = 0, way = 0;
        Scanner input = new Scanner(System.in);

        speed = input.nextInt();
        time = input.nextInt();
        input.close();
        if (speed >= 0) {
            if (time * speed >= mkadLength) {
                way = time * speed;
                totalWay = way / mkadLength;
                totalWay *= mkadLength;
                stopMark = way - totalWay;
            } else {
                stopMark = time * speed;
            }
        } else {
            if (time * Math.abs(speed) >= mkadLength) {
                way = time * Math.abs(speed);
                totalWay = way / mkadLength;
                totalWay *= mkadLength;
                stopMark = mkadLength - (way - totalWay);
            } else {
                stopMark = Math.abs(mkadLength - (time * Math.abs(speed)));
            }
        }
        System.out.println(stopMark);
    }
}
