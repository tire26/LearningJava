package homework.homeseven.crossesZeroes;

import java.util.Scanner;

public class Play {

    public static int enterSizeOfMap(Scanner scanner) {

        int number = 0;
        boolean check;

        do {

            if (scanner.hasNextInt()) {

                number = scanner.nextInt();
                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        } while (!check);
        return number;
    }

    public static boolean somebodyWon(Field field, int size) {

        if (field.threeHorizontallyCross(size) || field.threeVerticallyCross(size) || field.threeRightDiagonallyCross(size) || field.threeLeftDiagonallyCross(size)) {

            System.out.println("The player for the crosses has won");
            return true;
        } else if (field.threeVerticallyZero(size) || field.threeHorizontallyZero(size) || field.threeRightDiagonallyZero(size) || field.threeLeftDiagonallyZero(size)) {

            System.out.println("The player for the zeros has won");
            return true;
        }
        return false;
    }

    final static String[] ADMISSIBLE_VALUE = new String[]{"X", "O"};
    final static String PC_PC_MODE = "PC-PC", USER_PC_MODE = "user-PC", USER_USER_MODE = "user-user";

    public static String enterMode(Scanner scanner) {

        String mode;
        boolean check;


        do {
            mode = scanner.nextLine();
            if (mode.equals(PC_PC_MODE) || mode.equals(USER_PC_MODE) || mode.equals(USER_USER_MODE)) {

                check = true;
            } else {

                System.out.println("Was entered wrong form of mode: ");
                check = false;
            }
        } while (!check);
        return mode;
    }

    public static void main(String[] args) {

        int size;
        String modeOfGame;
        int countOfTurns = 0;
        Scanner scanner = new Scanner(System.in);
        Field field = new Field();

        System.out.print("Enter mode of game: ");
        modeOfGame = enterMode(scanner);

        System.out.print("Enter size of map: ");
        size = enterSizeOfMap(scanner);
        field.makeMap(size);
        System.out.println(size * size);
        boolean gameIsEnd = false;
        switch (modeOfGame) {

            case PC_PC_MODE: {


                for (int i = 0; i < size * size; i++) {

                    for (String currentSymbol : ADMISSIBLE_VALUE) {

                        if (countOfTurns != size * size) {
                            field.AIMakeTurn(size, currentSymbol);
                            field.paintMap(size);
                            countOfTurns++;
                            if (somebodyWon(field, size)) {

                                gameIsEnd = true;
                                break;
                            }
                        }
                    }
                    if (gameIsEnd) {

                        break;
                    }
                }
                if (countOfTurns == size * size && !gameIsEnd) {

                    System.out.println("Nobody won");
                }
            }
            break;
            case USER_PC_MODE: {

                scanner.nextLine();
                do {

                    for (String currentSymbol : ADMISSIBLE_VALUE) {

                        if (countOfTurns != size * size) {

                            if (currentSymbol.equals(ADMISSIBLE_VALUE[1])) {

                                System.out.println("Turn of PC");
                                field.AIMakeTurn(size, ADMISSIBLE_VALUE[1]);
                            } else {

                                System.out.println("Turn of user");
                                System.out.print("Enter where you want to set CROSS: ");
                                field.playerMakeTurn(size, ADMISSIBLE_VALUE[0], scanner);
                            }
                            field.paintMap(size);
                            countOfTurns++;
                            if (somebodyWon(field, size)) {

                                gameIsEnd = true;
                                break;
                            }
                        }
                    }
                    if (gameIsEnd) {

                        break;
                    }
                } while (countOfTurns != size * size);
                if (countOfTurns == size * size && !gameIsEnd) {

                    System.out.println("Nobody won");
                }
            }
            break;
            case USER_USER_MODE: {

                scanner.nextLine();
                do {
                    for (String currentSymbol : ADMISSIBLE_VALUE) {

                        if (countOfTurns != size * size) {

                            if (currentSymbol.equals(ADMISSIBLE_VALUE[1])) {

                                System.out.println("Turn of user 2");
                                System.out.print("Enter where you want to set ZERO: ");

                                field.playerMakeTurn(size, ADMISSIBLE_VALUE[1], scanner);
                            } else {

                                System.out.println("Turn of user 1");
                                System.out.print("Enter where you want to set CROSS: ");
                                field.playerMakeTurn(size, ADMISSIBLE_VALUE[0], scanner);
                            }
                            field.paintMap(size);
                            countOfTurns++;
                            if (somebodyWon(field, size)) {

                                gameIsEnd = true;
                                break;
                            }
                        }
                    }
                    if (gameIsEnd) {

                        break;
                    }
                } while (countOfTurns != size * size);
                if (countOfTurns == size * size && !gameIsEnd) {

                    System.out.println("Nobody won");
                }
            }
            break;
            default:
                System.out.println("Error");
        }

    }
}