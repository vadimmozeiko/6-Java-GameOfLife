package nd.pkg6;

import java.util.Arrays;

public class ND6 {

    public static void main(String[] args) {

        // Generates random board
//        char[][] field = new char[10][20];
//        for (int y = 0; y < field.length; y++) {
//            char[] line = field[y];
//            for (int x = 0; x < line.length; x++) {
//                if (Math.random() < 0.2) {
//                    line[x] = 'X';
//                } else {
//                    line[x] = '.';
//                }
//            }
//        }
        char[][] field = {
            {'.', 'X', '.', '.'},
            {'.', '.', 'X', '.'},
            {'.', 'X', 'X', '.'},
            {'X', '.', 'X', '.'},
            {'.', '.', '.', '.'}
        };

        // Prints out current generated board
        for (int y = 0; y < field.length; y++) {
            char[] line = field[y];
            for (int x = 0; x < line.length; x++) {
                System.out.print(line[x]);
            }
            System.out.println();
        }
        System.out.println("--------------------");

        // Generates 50 iterations
        for (int i = 0; i < 50; i++) {
            char[][] newField = new char[field.length][field[0].length];
            for (int y = 0; y < field.length; y++) {
                char[] line = field[y];
                for (int x = 0; x < line.length; x++) {
                    int kk = 0;
                    if (y > 0) {
                        kk += (x > 0 && field[y - 1][x - 1] == 'X') ? 1 : 0;
                        kk += (field[y - 1][x] == 'X') ? 1 : 0;
                        kk += (x < field[y].length - 1 && field[y - 1][x + 1] == 'X') ? 1 : 0;
                    }
                    kk += (x > 0 && field[y][x - 1] == 'X') ? 1 : 0;
                    kk += (x < field[y].length - 1 && field[y][x + 1] == 'X') ? 1 : 0;
                    if (y < field.length - 1) {
                        kk += (x > 0 && field[y + 1][x - 1] == 'X') ? 1 : 0;
                        kk += (field[y + 1][x] == 'X') ? 1 : 0;
                        kk += (x < field[y].length - 1 && field[y + 1][x + 1] == 'X') ? 1 : 0;
                    }
                    if (field[y][x] == 'X') {
                        newField[y][x] = (kk == 2 || kk == 3) ? 'X' : '.';
//                        if (kk == 2 || kk == 3) {
//                            newField[y][x] = 'X';
//                        } else {
//                            newField[y][x] = '.';
//                        }
                    } else {
                        newField[y][x] = (kk == 3) ? 'X' : '.';
//                        if (kk == 3) {
//                            newField[y][x] = 'X';
//                        } else {
//                            newField[y][x] = '.';
//                        }
                    }
                }
            }
            for (int y = 0; y < field.length; y++) {
                char[] line = field[y];
                for (int x = 0; x < line.length; x++) {
                    System.out.print(line[x]);
                }
                System.out.println();
            }

            System.out.println((i + 1) + "--------------------");

            boolean status = true;
            for (int x = 0; x < field.length; x++) {
                for (int y = 0; y < field[x].length; y++) {
                    if (field[x][y] != newField[x][y]) {
                        status = false;
                        System.out.println("DIFFERENT");
                        break;
                    } else {
                        System.out.println("SAME");
                    }
                }
                if(!status){
                    break;
                }
            }

            field = newField;

        }
    }
}
