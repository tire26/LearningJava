package lr.labatwo;

import java.util.Scanner;

public class RegexForUUID {
    public static void main(String[] args) {
        String txt;
        System.out.println("enter UUID");
        Scanner input = new Scanner(System.in);
        txt = input.nextLine();
        System.out.println(txt.matches("((?=[{(][^{}()]{36}[})])"
        + "(^.([0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}).$))"
        + "|^([0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12})$"));
        input.close();
    }
}
