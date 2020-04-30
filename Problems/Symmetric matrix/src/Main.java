import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        boolean symmetric = true;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix [i][j] = scanner.nextInt();
                }
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if (symmetric){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}