package homework.homeseven.crossesZeroes;

import java.util.Scanner;

public class Field {

    private State[][] field;

    public void makeMap(int size) {

        field = new State[size][size];
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                field[i][j] = State.EMPTY;
            }
        }
    }

    public String enterCoordinates(Scanner scanner, int size) {

        String number, coordinate = "^[0-9]{2}$";
        boolean check;

        do {

            number = scanner.nextLine();
            if (number.matches(coordinate)) {

                char[] sepString = number.toCharArray();
                if (Character.getNumericValue(sepString[0]) <= size && Character.getNumericValue(sepString[1]) <= size && Character.getNumericValue(sepString[0]) > 0 && Character.getNumericValue(sepString[1]) > 0 && isCellFree((Character.getNumericValue(sepString[0] - 1)), Character.getNumericValue(sepString[1] - 1))) {

                    check = true;
                } else {

                    System.out.println("Was entered wrong coordinate: ");
                    check = false;
                }
            } else {

                System.out.println("Was entered wrong coordinate: ");
                check = false;
            }
        } while (!check);
        return number;
    }

    public void AIMakeTurn(int size, String currentSymbol) {

        int x;
        int y;
        do {


            x = (int) (Math.random() * size);
            y = (int) (Math.random() * size);
        } while (!isGameEnd(size) && !isCellFree(x, y));
        setCell(x, y, currentSymbol);
    }

    public void playerMakeTurn(int size, String currentSymbol, Scanner scanner) {

        String coordinate;
        char[] XY;
        do {

            coordinate = enterCoordinates(scanner, size);
            XY = coordinate.toCharArray();

        } while (isGameEnd(size));
        setCell(Character.getNumericValue(XY[0] - 1), Character.getNumericValue(XY[1] - 1), currentSymbol);

    }

    public boolean isCellFree(int x, int y) {

        return field[x][y] == State.EMPTY;
    }

    public void setCell(int x, int y, String currentSymbol) {

        if (currentSymbol.equals("O")) {

            field[x][y] = State.ZERO;
        } else {
            field[x][y] = State.CROSS;
        }

    }

    public boolean isGameEnd(int size) {

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if (field[j][i] == State.EMPTY) {

                    return false;
                }
            }
        }
        return true;
    }

    public boolean threeHorizontallyCross(int size) {

        for (int i = 0; i  + 2 < size; i++) {

            for (int j = 0; j < size; j++) {

                if (field[i][j] == State.CROSS && field[i + 1][j] == State.CROSS && field[i + 2][j] == State.CROSS) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean threeVerticallyCross(int size) {

        for (int i = 0; i + 2 < size; i++) {

            for (int j = 0; j < size; j++) {

                if (field[j][i] == State.CROSS && field[j][i + 1] == State.CROSS && field[j][i + 2] == State.CROSS) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean threeRightDiagonallyCross(int size) {

        for (int i = 0; i + 2 < size; i++) {

            for (int j = 0; j + 2 < size; j++) {

                if (field[i][j] == State.CROSS && field[i + 1][j + 1] == State.CROSS && field[i + 2][j + 2] == State.CROSS) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean threeLeftDiagonallyCross(int size) {

        for (int i = size - 1; i - 2 >= 0; i--) {

            for (int j = 0; j + 2 < size; j++) {

                if (field[i][j] == State.CROSS && field[i - 1][j + 1] == State.CROSS && field[i - 2][j + 2] == State.CROSS) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean threeHorizontallyZero(int size) {

        for (int i = 0; i + 2 < size; i++) {

            for (int j = 0; j < size; j++) {

                if (field[j][i] == State.ZERO && field[j][i + 1] == State.ZERO && field[j][i + 2] == State.ZERO) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean threeVerticallyZero(int size) {

        for (int i = 0; i + 2 < size; i++) {

            for (int j = 0; j < size; j++) {

                if (field[j][i] == State.ZERO && field[j][i + 1] == State.ZERO && field[j][i + 2] == State.ZERO) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean threeRightDiagonallyZero(int size) {

        for (int i = 0; i + 2 < size; i++) {

            for (int j = 0; j + 2 < size; j++) {

                if (field[i][j] == State.ZERO && field[i + 1][j + 1] == State.ZERO && field[i + 2][j + 2] == State.ZERO) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean threeLeftDiagonallyZero(int size) {

        for (int i = size - 1; i - 2 >= 0; i--) {

            for (int j = 0; j + 2 < size; j++) {

                if (field[i][j] == State.ZERO && field[i - 1][j + 1] == State.ZERO && field[i - 2][j + 2] == State.ZERO) {

                    return true;
                }
            }
        }
        return false;
    }

    public void paintMap(int size) {

        StringBuffer map = new StringBuffer();
        map.append("  ");
        for (int i = 0; i < size; i++) {

            map.append(i + 1).append("  ");
        }
        map.append("\n");
        for (int i = 0; i < size; i++) {

            map.append(i + 1);
            for (int j = 0; j < size; j++) {

                switch (field[j][i]) {
                    case ZERO -> map.append("[").append("O").append("]");
                    case CROSS -> map.append("[").append("X").append("]");
                    case EMPTY -> map.append("[").append(" ").append("]");
                }
            }
            map.append("\n");
        }
        System.out.println(map);
    }
}
