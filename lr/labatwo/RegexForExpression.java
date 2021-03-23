package lr.labatwo;

import java.util.Scanner;

public class RegexForExpression {
        public static void main(String[] args) {
        
        String txt;
        System.out.println("enter date");
        Scanner input = new Scanner(System.in);
        txt = input.nextLine();
        System.out.println(txt.matches("^([^()]*+(?:((?))|)(?))|)+)[^()]*$"));
        input.close();
    }
}
