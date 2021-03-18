package lr.labatwo;

import java.util.Scanner;

public class RegexForColors {
    
    public static void main(String[] args) {

        String txt;
        System.out.println("enter color code");
        Scanner input = new Scanner(System.in);

        txt = input.nextLine();
        System.out.println(txt.matches("^#([A-Fa-f0-9]{6})$"));
        input.close();
    }
}
