package y2023.march.starter83;

import java.util.Scanner;

public class BudgetOfTechnex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int R = sc.nextInt();
            R *= 1000;
            System.out.println((R / 2) / 5);
            T--;
        }
    }
}
