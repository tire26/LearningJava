package test;

import java.util.Scanner;

public class LettersIntoNums {
    public static void main(String[] args) {
        StringBuilder totalString = new StringBuilder();
        Scanner input = new Scanner(System.in);
        char[] letters = input.nextLine().toCharArray();
        String buffer, alphabet = "àáâãäå¸æçèéêëìíîïğñòóôõö÷øùúûüışÿ", alphabetUp  = "ÀÁÂÃÄÅ¨ÆÇÈÉÊËÌÍÎÏĞÑÒÓÔÕÖ×ØÙÚÛÜİŞß";

        input.close();

        for (int i = 0; i < letters.length; i++) {
            buffer = Character.toString(letters[i]);
            if (alphabet.contains(buffer)) {
                totalString.append("[");
                totalString.append(alphabet.indexOf(buffer) + 1);
                totalString.append("]");
            } else if (alphabetUp.contains(buffer)) {
                totalString.append("[");
                totalString.append(alphabetUp.indexOf(buffer) + 34);
                totalString.append("]");
            }
        }
        System.out.println(totalString);
    }
}
