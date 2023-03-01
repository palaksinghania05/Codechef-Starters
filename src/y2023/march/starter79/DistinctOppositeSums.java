package y2023.march.starter79;

import java.util.Scanner;

public class DistinctOppositeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int i = 1;
            while (i < N) {
                System.out.print(i + " " + N + " ");
                i++;
                N--;
            }
            System.out.println();
            T--;
        }
    }
}
