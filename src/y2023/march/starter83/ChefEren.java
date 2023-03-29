package y2023.march.starter83;

import java.util.Scanner;

public class ChefEren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int total = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0)
                    total += A;
                else
                    total += B;
            }
            System.out.println(total);
            T--;
        }
    }
}
