package y2024.june.starter139;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int temp = 10000001;
        boolean[] isPrime = new boolean[temp];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i < temp; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < temp; j += i)
                    isPrime[j] = false;
            }
        }
        long pr = 0;
        long[] tempArr = new long[temp];
        for (int i = 2; i < temp; i++) {
            if (isPrime[i])
                pr += i;
            tempArr[i] = pr;
        }
        while (T > 0) {
            int N = sc.nextInt();
            int ele = 1;
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    ele = i;
                    break;
                }
            }
            if (ele == 1)
                ele = N;
            if (N == 1) {
                System.out.println(0);
                continue;
            }
            System.out.println(N * tempArr[ele]);
            T--;
        }
    }
}
