package nd.pkg6;


public class ND6 {

    public static void main(String[] args) {

        // Generates random board
        char[][] field = new char[10][20];
        for (int y = 0; y < field.length; y++) {
            char[] line = field[y];
            for (int x = 0; x < line.length; x++) {
                if (Math.random() < 0.2) {
                    line[x] = 'X';
                } else {
                    line[x] = '.';
                }
            }
        }


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
                    } else {
                        newField[y][x] = (kk == 3) ? 'X' : '.';
                    }
                }
            }
            
            // Prints out new iteration
            for (int y = 0; y < field.length; y++) {
                char[] line = field[y];
                for (int x = 0; x < line.length; x++) {
                    System.out.print(line[x]);
                }
                System.out.println();
            }

            System.out.println((i + 1) + "--------------------");
            
            // Check if next iteration repeats
            boolean diff = false;
            for (int x = 0; x < field.length; x++) {
                for (int y = 0; y < field[x].length; y++) {
                    if (field[x][y] != newField[x][y]) {
                        diff = true;
                    }
                }
            }
            if (!diff) {
                System.out.println("GAME OVER");
                break;
            }

            field = newField;

        }
    }
}
