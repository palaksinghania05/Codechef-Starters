package y2023.september.starter102;

import java.util.Scanner;

public class SellingInsurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            double result = 100 / (X * 0.2);
            System.out.println((int) Math.ceil(result));
            T--;
        }
    }
}
