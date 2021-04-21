package homework.homesix;

import java.util.HashMap;
import java.util.Scanner;

public class ForwardingMessages {

    private static final String CHECK_REGEX = "^([\\w]{2,}@[a-zA-Z]{3,}\\.[a-zA-Z]{2,}):([\\w]{2,}@[a-zA-Z]{3,}\\.[a-zA-Z]{2,})$", END_COMMAND = "END";

    private static void enterStrings(HashMap<String, String> senderRecipient, Scanner scanner) {

        String buffer;
        String[] sepString;
        boolean check;

        do {
            System.out.print("Enter new a couple of mails: ");
            buffer = scanner.nextLine();
            if (buffer.equals(END_COMMAND)) {

                check = true;
            } else {

                if (buffer.matches(CHECK_REGEX)) {

                    check = true;
                    sepString = buffer.split(":");
                    senderRecipient.put(sepString[0], sepString[1]);
                    enterStrings(senderRecipient, scanner);
                } else {

                    check = false;
                    System.out.println("Was entered wrong string");
                }
            }
        } while (!check);
    }

    private static void outputOfMails(HashMap<String, String> senderRecipient) {  // вывод и склеивание почт

        StringBuilder finalString = new StringBuilder();
        String currentExtremeRecipient;

        for (String key : senderRecipient.keySet()) {

            if (!senderRecipient.containsValue(key)) { // ключ на границе равен проверяемому значению мапы и этот элемент ещё не был выведен

                currentExtremeRecipient = senderRecipient.get(key);
                finalString.append(key);
                finalString.append(" > ");
                finalString.append(currentExtremeRecipient);
                while (senderRecipient.containsKey(currentExtremeRecipient)) {

                    currentExtremeRecipient = senderRecipient.get(currentExtremeRecipient);
                    finalString.append(" > ");
                    finalString.append(currentExtremeRecipient);
                }
                finalString.append("\n");
            }
        }
        System.out.println(finalString);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> senderRecipient = new HashMap<>();

        enterStrings(senderRecipient, scanner);
        outputOfMails(senderRecipient);
    }
}
