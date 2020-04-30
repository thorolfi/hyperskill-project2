import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "YES";
        char[][] matrix = new char[4][4];
        for (int i=0; i<4; i++){
            matrix[i] = scanner.next().toCharArray();
        }

        for (int i = 0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                char a = matrix[i][j];
                char b = matrix[i][j + 1];
                char c = matrix[i + 1][j];
                char d = matrix[i + 1][j + 1];
                if (a == b && a == c && a == d) {
                    result = "NO";
                }
            }
        }
        System.out.println(result);
    }
}