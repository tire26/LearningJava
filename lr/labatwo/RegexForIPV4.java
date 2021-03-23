package lr.labatwo;

import java.util.Scanner;

public class RegexForIPV4 {
 
    public static void main(String[] args) {

        String txt;
        System.out.println("enter IPV4");
        Scanner input = new Scanner(System.in);

        txt = input.nextLine();
        System.out.println(txt.matches("^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.)"
        + "{3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$"));
        input.close();
    }
}
