import java.util.Arrays;
import java.util.Scanner;

public class _5_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, scanner);

        String command = scanner.nextLine();
        while(!command.equals("END")){
            String[] arr = command.split("\\s++");
            if(arr[0].equals("swap")&&arr.length==5) {
                int rowFirst = Integer.parseInt(arr[1]);
                int colFirst = Integer.parseInt(arr[2]);

                int rowSecond = Integer.parseInt(arr[3]);
                int colSecond = Integer.parseInt(arr[4]);

                if(rowFirst<rows&&rowSecond<rows&&colFirst<cols&&colSecond<cols&& rowFirst>=0&&rowSecond>=0&&colFirst>=0&&colSecond>=0) {
                    String firstElement = matrix[rowFirst][colFirst];
                    String secondElement = matrix[rowSecond][colSecond];

                    matrix[rowFirst][colFirst] = secondElement;
                    matrix[rowSecond][colSecond] = firstElement;

                    printMatrix(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row:matrix) {
            for (String element:row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner){
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine()
                    .split("\\s+");
        }
    }
}
