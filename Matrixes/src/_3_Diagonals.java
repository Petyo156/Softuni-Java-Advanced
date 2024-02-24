import java.util.Scanner;

public class _3_Diagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        fillMatrixAndDoStuff(matrix, n, scanner);
    }

    private static void fillMatrixAndDoStuff(int[][] matrix, int n, Scanner scanner) {
        int sumPrimaryDiagonal = 0;

        for(int row = 0; row < n; row++){
            for (int col = 0; col < n; col++) {
                matrix[row][col] = scanner.nextInt();
                if(row==col){
                    sumPrimaryDiagonal+=matrix[row][col];
                }
            }
        }

        int sumSecondaryDiagonal = getSumElementsOnSecondaryDiagonal(matrix, n);
        System.out.println(Math.abs(sumPrimaryDiagonal-sumSecondaryDiagonal));
    }

    private static int getSumElementsOnSecondaryDiagonal(int[][] matrix, int n){
        int sum = 0;
        for(int row = 0; row < n; row++){
            for (int col = 0; col < n; col++) {
                if(col==n-row-1){
                    sum+=matrix[row][col];
                }
            }
        }
        return  sum;
    }
}
