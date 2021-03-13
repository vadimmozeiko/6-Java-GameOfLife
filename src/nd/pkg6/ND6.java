package nd.pkg6;

public class ND6 {

    public static void main(String[] args) {

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
        
        for (int y = 0; y < field.length; y++) {
            char[] line = field[y];
            for (int x = 0; x < line.length; x++) {
                System.out.print(line[x]);
            }
            System.out.println();
        }
        System.out.println("--------------------");

        
        int width = field.length;
        int height = field[0].length;
        // Create a copy of the original board
        char[][] copyBoard = new char[width][height];

        // Create a copy of the original board
        for (int row = 0; row < width; row++) {
            for (int col = 0; col < height; col++) {
                copyBoard[row][col] = field[row][col];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < field.length; j++) {
                char[] line = field[j];
                for (int x = 0; x < line.length; x++) {
                    System.out.print(line[x]);
                }
                System.out.println();
            }
            System.out.println("====================");
        }

    }
}
