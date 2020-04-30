import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] incomes = new double[scanner.nextInt()];

        for (int i = 0; i < incomes.length; i++) {
            incomes[i] = scanner.nextDouble();
        }
        double[] percent = new double[incomes.length];
        double[] taxes = new double[incomes.length];
        double x = 0;
        int y = 1;

        for (int j = 0; j < percent.length; j++){
            percent[j] = scanner.nextDouble();
            taxes[j] = incomes[j] * percent[j] / 100;

            if (taxes[j] > x) {
                x = taxes[j];
                y = j + 1;
            }
        }
        System.out.println(y);

    }
}