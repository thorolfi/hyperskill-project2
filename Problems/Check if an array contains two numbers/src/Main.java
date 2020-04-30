// Posted from EduTools plugin
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = false;
        int[] ints = new int[scanner.nextInt()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < ints.length; i++){
            if ((ints[i] == n && ints[i - 1] == m) || (ints[i] == m && ints[i - 1] == n)){
                b = true;
                break;
            }
        }System.out.println(b);

    }
}