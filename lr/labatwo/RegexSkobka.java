package lr.labatwo;

import java.util.Scanner;

public class RegexSkobka {
    public static void main(String[] args) {
        String txt;
        System.out.println("enter expression");
        Scanner input = new Scanner(System.in);
        txt = input.nextLine();
        System.out.println(txt.matches("^((?=.[0-9])(?=.[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,})$"));
        input.close();
    }
}
