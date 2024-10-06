package y2024.october.starter154;

import java.util.Scanner;

public class GCDOrXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
            }
            boolean flag = true;
            for (long ele : arr) {
                if (ele != K) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(0);
            } else {
                int temp = -1, val = N;
                for (int i = 0; i < N; i++) {
                    if (arr[i] != K) {
                        if (temp == -1) temp = i;
                        val = i;
                    }
                }
                if (temp == val) {
                    System.out.println(1);
                } else {
                    boolean xorA = true, xorB = true;
                    long temp2 = (arr[temp] ^ K);
                    for (int i = temp; i <= val; i++) {
                        if (arr[i] % K != 0)
                            xorB = false;
                        if ((arr[i] ^ K) != temp2)
                            xorA = false;
                    }
                    if (xorA || xorB) {
                        System.out.println(1);
                    } else {
                        System.out.println(2);
                    }
                }
            }
            T--;
        }
    }
}
