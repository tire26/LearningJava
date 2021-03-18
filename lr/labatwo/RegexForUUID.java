package lr.labatwo;

import java.util.Scanner;

public class RegexForUUID {
    public static void main(String[] args) {
        String txt;
        System.out.println("enter UUID");
        Scanner input = new Scanner(System.in);
        txt = input.nextLine();
        System.out.println(txt.matches("^[0-9a-f][0-9a-f]{7}(-([0-9a-f]){4}){3}-[0-9a-f]{12}$"));
        input.close();
    }
}
