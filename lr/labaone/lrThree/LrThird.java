package lr.labaone.lrThree;

import java.util.Scanner;

public class LrThird {
    public static void main(String[] args) {
        Scanner in;
        String[] proposals = new String[20]; // numOfVowels - тут будет лежать предложение, разделённое по гласным, в numOfConsonants по согласным
        String text = null;
        int numOfVowels = 0, numOfConsonants = 0;

        System.out.println("Entere your text, please end proposals by '.':");
        in = new Scanner(System.in);
        text = in.nextLine();
        in.close();
        proposals = text.split("[.!?:;]+");

       for (int i = 0; i < proposals.length; i++) {
            numOfVowels = proposals[i].split("(?i:[aeiouy]+)").length; // Делим предложение по гласным, таким образом узнаем их кол-во
            numOfConsonants = proposals[i].split("(?i:[qwrtpsdfghjklzxcvbnm]+)").length; // Делим предложение по согласным, таким образом узнаем их кол-во
            if (Character.toString(proposals[0].charAt(proposals[0].length() - 1)).matches("(?i:[aeiouy])")) { // Проверяем последний символ на гласность или согасность
                numOfVowels += 1;
            } else if (Character.toString(proposals[0].charAt(proposals[0].length() - 1)).matches("(?i:[qwrtpsdfghjklzxcvbnm])")) {
                numOfConsonants += 1;
            }
            if (numOfVowels > numOfConsonants) {
                System.out.println("In proposal " + (i + 1) + " more vowels");
            } else if (numOfVowels < numOfConsonants) {
                System.out.println("In proposal " + (i + 1) + " more consognats");
            } else {
                System.out.println("In proposal " + (i + 1) + " equal count of vowels and consognats");
            }

        }
    }
}
