package lr.labatwo;

import java.util.Scanner;

public class ExactString {
    public static void main(String[] args) {
        
        Scanner input;
        String str = new String(), comparedString = "abcdefghijklmnopqrstuv18340";

        System.out.println("Enter your string: ");
        input = new Scanner(System.in);
        str = input.nextLine();
        System.out.println(comparedString.matches(str));
        input.close();
    }
}
