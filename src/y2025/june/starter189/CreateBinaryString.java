package y2025.june.starter189;

import java.util.Scanner;

public class CreateBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int temp = Math.max(C, D);
            int result = 0;
            for (int i = 0; i <= N; i++) {
                int temp2 = N - i;
                int crossPairs = i * temp2;
                int total = A * i + B * temp2 + temp * crossPairs;
                if (total > result) {
                    result = total;
                }
            }
            System.out.println(result);
        }
    }
}
