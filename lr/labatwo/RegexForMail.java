package lr.labatwo;

import java.util.Scanner;

public class RegexForMail {
    public static void main(String[] args) {
        String txt;
        System.out.println("enter UUID");
        Scanner input = new Scanner(System.in);
        txt = input.nextLine();
        System.out.println(txt.matches("^(?=(.{1,64}@))(?=(.{7,255}$))"
        + "(?=(.{7,255}$))(((([a-zA-Z]|[а-яА-Я]|[ё]|[Ё])((\\w|[а-яА-ЯёЁ-]|\\.)*"
        + "([a-zA-Zа-яА-ЯёЁ]|\\d))*(\\+1){0,1}){1,64}@)(((([a-zA-Z]|[а-яА-Я]|[ё]|[Ё]|"
        + "\\d){2,}\\.)+([a-zA-Z]|[а-яА-Я]|[ё]|[Ё]){2,})|((\\d\\.|[1-9]\\d\\.|1\\d{2}\\.|"
        + "2[1-4]\\d\\.|25[0-5]\\.){3}(\\d|[1-9]\\d|1\\d{2}|2[1-4]\\d|25[0-5]))))$"));
        input.close();
    }
}
