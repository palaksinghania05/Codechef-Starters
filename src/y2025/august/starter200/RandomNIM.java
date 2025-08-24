package y2025.august.starter200;

import java.util.Scanner;

public class RandomNIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int count = 0;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (ele == 1)
                    count++;
            }
            if (count == N) {
                if (count % 2 == 0)
                    System.out.println(0);
                else
                    System.out.println(1);
            } else
                System.out.println(499122177);
        }
    }
}
