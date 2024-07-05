package y2024.july.starter141;

import java.util.Scanner;

public class NearlyEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            int minHammingDistance = Integer.MAX_VALUE;
            for (int i = 0; i <= N - M; i++) {
                int hammingDistance = 0;
                for (int j = 0; j < M; j++) {
                    if (A.charAt(i + j) != B.charAt(j)) {
                        hammingDistance++;
                    }
                }
                if (hammingDistance < minHammingDistance) {
                    minHammingDistance = hammingDistance;
                }
            }
            System.out.println(minHammingDistance);
            T--;
        }
    }
}
