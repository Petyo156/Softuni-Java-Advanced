import java.util.Arrays;
import java.util.Scanner;

public class _4_MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix, scanner);

        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = matrix[row][col] + matrix[row + 1][col] + matrix[row + 2][col]
                        + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col + 1] + matrix[row + 2][col + 2]
                        + matrix[row + 2][col + 1] + matrix[row + 1][col + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        for (int row = bestRow; row <= bestRow + 2; row++) {
            for (int col = bestCol; col <= bestCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}