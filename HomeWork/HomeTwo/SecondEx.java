package HomeWork.HomeTwo;

import java.util.Scanner;

public class SecondEx {
    public static void main(String[] args) {
        System.out.print("Entere your string: ");
        Scanner in = new Scanner(System.in);
        char[] letters = in.nextLine().toCharArray(); // Разделяем строку на массив символов
        in.close();

        for (int i = 0; i < letters.length; i++) { // берём каждый симвло и проверяем по условиям
            if (Character.isLetter(letters[i])) {
                if (letters[i] == 'z') {
                    letters[i] = 'a';
                } else if (letters[i] == 'Z') {
                    letters[i] = 'A';
                } else {
                    letters[i] = (char) ((int) letters[i] + 1);
                }
            }
        }
        System.out.println(letters);
    }
}
