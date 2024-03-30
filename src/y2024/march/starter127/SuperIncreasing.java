package y2024.march.starter127;

import java.util.Scanner;

public class SuperIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int X = sc.nextInt();
            int temp = K - 1;
            int result = (int) Math.pow(2, temp);
            if (X >= result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
