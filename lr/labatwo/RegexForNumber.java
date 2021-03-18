package lr.labatwo;

import java.util.Scanner;

public class RegexForNumber {
    public static void main(String[] args) {
        
        Scanner input;
        String str = new String(), comparedString = "(?i:([1-9abcdef]{1}[0-9abcdef]+))";

        System.out.println("Enter your num: ");
        input = new Scanner(System.in);
        str = input.nextLine();
        System.out.println(str.matches(comparedString));
        input.close();
    }
}
