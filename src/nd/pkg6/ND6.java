
package nd.pkg6;

public class ND6 {

    public static void main(String[] args) {
     
        
        char[][] field = new char[50][50];
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
        
    }
    
}
