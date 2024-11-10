package y2024.november.starter159;

import java.util.Scanner;

public class RandomNim {
    public static long helperFunc(long ele1, long ele2) {
        long mod = (long) (1e9 + 7), temp;
        temp = mod - 2;
        while (temp != 0) {
            if ((temp & 1) == 1) {
                ele1 = (ele1 * ele2) % mod;
            }
            ele2 = (ele2 * ele2) % mod;
            temp >>= 1;
        }
        return ele1;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int D = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(helperFunc(D + 1, 2L * D));
            T--;
        }
    }
}
