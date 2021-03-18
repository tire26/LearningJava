package classWork.lesson1303;

import java.util.Date;

public class Lesson {
    public static void main(String[] args) {
        String str = new String();
        long start = new Date().getTime();
        for (int i = 0; i < 10_000; i++) {
            str += 1;
        }
        long end = new Date().getTime();
        System.out.println(end - start);
        StringBuffer sb = new StringBuffer();
        start = new Date().getTime();
        for (int i = 0; i < 10_000; i++) {
            sb.append(i);
        }
        end = new Date().getTime();
        System.out.println(end - start);
    }
}
