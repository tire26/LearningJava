package homework.homesix;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamMerger {

    public static final String STREAM1 = "STREAM 1", STREAM2 = "STREAM 2", STREAM3 = "STREAM 3", END_COMMAND = "END",
            NUM_REGEX = "^-?[0-9]*$";

    public static String enter(Scanner scanner) {
        String buffer;
        boolean check;

        do {
            buffer = scanner.nextLine();
            if (isCommand(buffer)) {

                check = true;
            } else if (buffer.matches(NUM_REGEX)) {

                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                check = false;
            }
        } while (!check);
        return buffer;
    }

    public static boolean isCommand(String command) {

        return command.equals(STREAM1) || command.equals(STREAM2) || command.equals(STREAM3)
                || command.equals(END_COMMAND);
    }

    public static String fillingStream(ArrayList<Integer> currentGroup, Scanner scanner,
                                       String currentStream) {

        String currentCommand = currentStream;
        do {
            String buffer = enter(scanner);
            if (!isCommand(buffer)) {
                try {
                    currentGroup.add(Integer.valueOf(buffer));
                } catch (NumberFormatException n) {

                    System.out.println("Was entered wrong format of number");
                }
            } else {

                currentCommand = buffer;
            }
        } while (currentCommand.equals(currentStream));
        return currentCommand;
    }

    public static void main(String[] args) {
        ArrayList<Integer> firstGroup = new ArrayList<>();
        ArrayList<Integer> secondGroup = new ArrayList<>();
        ArrayList<Integer> thirdGroup = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String currentCommand;
        boolean programEnd = false;

        currentCommand = STREAM1; // сначала ввод ставиться в первый поток
        do {

            switch (currentCommand) {
                case STREAM1:

                    currentCommand = fillingStream(firstGroup, scanner, STREAM1);
                    System.out.println("current stream: " + currentCommand);
                    break;
                case STREAM2:

                    currentCommand = fillingStream(secondGroup, scanner, STREAM2);
                    System.out.println("current stream: " + currentCommand);
                    break;
                case STREAM3:

                    currentCommand = fillingStream(thirdGroup, scanner, STREAM3);
                    System.out.println("current stream: " + currentCommand);
                    break;
                case END_COMMAND:

                    if (firstGroup.isEmpty() && secondGroup.isEmpty() && thirdGroup.isEmpty()) {

                        programEnd = true;
                        System.out.println("All group is empty");
                    } else {

                        int i = 0;
                        while (!programEnd) {

                            if (i >= firstGroup.size() && i >= secondGroup.size() && i < thirdGroup.size()) {  // в первой и второй группе нет элементов под таким индексом

                                System.out.print(thirdGroup.get(i));
                            } else if (i >= firstGroup.size() && i >= thirdGroup.size() && i < secondGroup.size()) {  // в первой и третьей группе нет элементов под таким индексом

                                System.out.print(secondGroup.get(i));
                            } else if (i >= thirdGroup.size() && i >= secondGroup.size() && i < firstGroup.size()) {  // во второй и третьей группе нет элементов под таким индексом

                                System.out.print(firstGroup.get(i));
                            } else if (i >= firstGroup.size() && i < secondGroup.size() && i < thirdGroup.size()) { // в первой группе нет элементов под таким индексом

                                System.out.print(secondGroup.get(i) + thirdGroup.get(i));
                            } else if (i >= secondGroup.size() && i < thirdGroup.size() && i < firstGroup.size()) {  // во второй группе нет элементов под таким индексом

                                System.out.print(firstGroup.get(i) + thirdGroup.get(i));
                            } else if (i >= thirdGroup.size() && i < secondGroup.size() && i < firstGroup.size()) {  // в третьей группе нет элементов под таким индексом

                                System.out.print(firstGroup.get(i) + secondGroup.get(i));
                            } else if (i < thirdGroup.size() && i < secondGroup.size() && i < firstGroup.size()) { // везде есть числа

                                System.out.print(firstGroup.get(i) + secondGroup.get(i) + thirdGroup.get(i));
                            } else { // конец

                                programEnd = true;
                            }
                            System.out.print(" ");
                            i++;
                        }
                    }
                    break;

                default:
                    System.out.println("Was entered wrong command or num");
            }

        } while (!programEnd);
    }
}
