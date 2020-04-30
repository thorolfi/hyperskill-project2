package tictactoe;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //accept input
        String input = scanner.nextLine();
        char[] elements = new char[9];

        for(int i = 0; i < 9; i++){
            elements[i] = input.charAt(i);
        }
        System.out.println("---------");
        System.out.println("| " + elements[0] + " " + elements[1] + " " + elements[2] + " |");
        System.out.println("| " + elements[3] + " " + elements[4] + " " + elements[5] + " |");
        System.out.println("| " + elements[6] + " " + elements[7] + " " + elements[8] + " |");
        System.out.println("---------");
    }
}
