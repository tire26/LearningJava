package lr.labatwo;

import java.util.Scanner;

public class RegexForIPV6 {
    
    public static void main(String[] args) {
        
        String txt;
        System.out.println("enter IPV6");
        Scanner input = new Scanner(System.in);
        txt = input.nextLine();
        System.out.println(txt.matches("^([0-9a-fA-F]{0,4}:){2,7}([0-9a-fA-F]{0,4})$"));
        input.close();
    }
}
