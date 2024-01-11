package y2024.january.starter116;

import java.util.Scanner;

public class MinimumWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min_wage = 11;
        if (N > min_wage) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
