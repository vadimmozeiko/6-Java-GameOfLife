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
        for (int i = 0; i < 1; i++) {
            
            for (int j = 0; j < field.length; j++) {
                for (int k = 0; k < field[i].length; k++) {
          
            }
        }

    }
}
}
