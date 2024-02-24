import java.util.Scanner;

public class _2_MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String[] arr = command.split(" ");

        int r = Integer.parseInt(arr[0]); int c = Integer.parseInt(arr[1]);

        int[][] matrix = new int[r][c];

        printMatrix(matrix, r, c);
    }
    private static void printMatrix(int[][] matrix, int r, int c){
        char a = 96;
        for (int rows = 0; rows < r; rows++) {
            for (int cols = 0; cols < c; cols++) {
                if(rows==0&&cols==0){System.out.print(a + ""+a + ""+a + " ");}
                else {
                    System.out.print((char) a +""+ (char)(a + 1) +""+ (char)a + " ");
                }
            }
            a = (char) (a+1);
            System.out.println();
        }
    }
}
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class _02MatrixOfPalindromes {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[][] matrix = readMatrix(scanner);
//        printMatrix(matrix);
//    }
//
//    private static String[][] readMatrix(Scanner scanner) {
//        int[] sizes = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        int rows = sizes[0];
//        int cols = sizes[1];
//        String[][] matrix = new String[rows][cols];
//        char char1 = 96;
//        char char2 = 96;
//        char char3 = 96;
//        for (int row = 0; row < rows; row++) {
//            char1++;
//            char2++;
//            char3++;
//            String[] array = new String[cols];
//            for (int col = 0; col < cols; col++) {
//                String text = char1 + "" + char2 + "" + char3;
//                array[col] = text;
//                char2++;
//            }
//            char2 = char1;
//            matrix[row] = array;
//        }
//        return matrix;
//    }
//    private static void printMatrix(String[][] matrix) {
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                System.out.printf("%s ",matrix[row][col]);
//            }
//            System.out.printf("%n");
//        }
//    }
//}