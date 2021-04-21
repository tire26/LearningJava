
import java.util.*;

public class Test {

    public static void main(String[] args) {

        int[] a = new int[] {1, 2, 3, 4, 5, 6};
        int[] a2 = new int[] {0, 0, 0, 0};
        int[] b = new int[3];
        int[] c = new int[3];

        System.arraycopy(a, 0, b, 0, 3);
        System.arraycopy(a, 3, c, 0, 3);
//        for (int s : b) {
//
//            System.out.println(s);
//        }
//        for (int s : c) {
//
//            System.out.println(s);
//        }
        a = new int[7];
        System.arraycopy(b, 0, a, 0, 3);
        a[4] = 0;
        System.arraycopy(c, 0, a, 4, 3);
        for (int s : a) {

            System.out.println(s);
        }
    }
}