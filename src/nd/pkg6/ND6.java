package nd.pkg6;

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
            field = newField;
            
           char c1 = ' ';
           char c2 = ' ';
           boolean check = false;
            for (int c = 0; c < field.length; c++) {
                for (int j = 0; j < field[c].length; j++) {
                    c1 = field[c][j];
                    c2 = newField[c][j];
                }
                    if (c1 == c2) {
                        check = true;
                    }
            }
            if (check == false) {
                for (int y = 0; y < field.length; y++) {
                    char[] line = field[y];
                    for (int x = 0; x < line.length; x++) {
                        System.out.print(line[x]);
                    }
                    System.out.println();
                }
                System.out.println((i + 1) + "--------------------");
            } 

        }
    }
}
