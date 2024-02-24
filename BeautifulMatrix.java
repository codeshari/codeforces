import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int rowValue = 0, columnValue = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt();

                if(matrix[row][col] != 0) {
                    rowValue = row;
                    columnValue = col;
                }
            }
        }

        System.out.println(rowValue + " " + columnValue);

        int moves = 0;
        if (rowValue !=2 || columnValue !=2) {
            if(rowValue < 2) {
                for(int i = rowValue; i < 2; i++) {
                    moves++;
                }

            } else {
                for(int i = rowValue; i > 2; i--) {
                    moves++;
                }
            }

            if(columnValue < 2) {
                for(int i = columnValue; i < 2; i++) {
                    moves++;
                }
            }
            else {
                for(int i = columnValue; i > 2; i--) {
                    moves++;
                }
            }
        }

        System.out.println(moves + " moves.");

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
