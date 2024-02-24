import java.util.Scanner;

public class E_2_ClearSkies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int rows = n; int cols = n;
        String[][] matrix = new String[rows][cols];

        int jRow = -1;
        int jCol = -1;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] cases = input.split("");
            for (int j = 0; j < cases.length; j++) {
                matrix[i][j] = cases[j];
                if(matrix[i][j].equals("J")){
                    jRow=i;
                    jCol=j;
                }
            }
        }

        int armour = 300; int hit = 0;
        String input;
        while (!(armour == 0) && planesExist(rows,cols,matrix)){
            input = scanner.nextLine();
            matrix[jRow][jCol] = "-";
            switch (input){
                case "up":
                    jRow--;
                    break;
                case "down":
                    jRow++;
                    break;
                case "left":
                    jCol--;
                    break;
                case "right":
                    jCol++;
                    break;
            }
            if(matrix[jRow][jCol].equals("E")){
                hit++;
                if(hit==4){
                    matrix[jRow][jCol] = "J";
                    break;
                }
                armour-=100;
            } else if(matrix[jRow][jCol].equals("R")){
                if(armour!=300){
                    armour+=300;
                }
            }
            matrix[jRow][jCol] = "J";
        }
        if(hit==3){
            System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!%n",jRow,jCol);
        } else {
            System.out.println("Mission accomplished, you neutralized the aerial threat!");
        }
        print(matrix,rows,cols);
    }

    private static boolean planesExist(int rows, int cols, String[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j].equals("E")){
                    return true;
                }
            }
        }
        return false;
    }

    private static void print(String[][] matrix, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
