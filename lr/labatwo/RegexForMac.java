package lr.labatwo;

import java.util.Scanner;

public class RegexForMac {
    
    public static void main(String[] args) {
        
        String txt;
        System.out.println("enter MAC");
        Scanner input = new Scanner(System.in);
        txt = input.nextLine();
        System.out.println(txt.matches("^((\\d|[A-F]){2}"
                + "(:|-)){5}(\\d|[A-F]){2}$"));
        input.close();
    }
}
