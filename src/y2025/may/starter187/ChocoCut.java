package y2025.may.starter187;

import java.util.Scanner;

public class ChocoCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int total = N * M;
            int result = 0;
            if (K == 0) {
                result = total;
            } else if (K < total) {
                for (int i = 1; i < N; i++) {
                    int part1 = i * M;
                    int part2 = (N - i) * M;
                    if (part1 >= K) result = Math.max(result, part2);
                    if (part2 >= K) result = Math.max(result, part1);
                }
                for (int j = 1; j < M; j++) {
                    int part1 = j * N;
                    int part2 = (M - j) * N;
                    if (part1 >= K) result = Math.max(result, part2);
                    if (part2 >= K) result = Math.max(result, part1);
                }
            }
            System.out.println(result);
        }
    }
}
