package test;

import java.util.regex.*;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        String str = new String();
        Scanner input = new Scanner(System.in);
        String regex = "^(-){0,1}\\d(.|,){0,1}\\d$";

        str = input.nextLine();
        input.close();
        System.out.println(Pattern.matches(regex, str));
    }
}
