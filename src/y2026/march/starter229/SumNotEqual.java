package y2026.march.starter229;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SumNotEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[][] arr = new long[N][2];
            for (int i = 0; i < N; i++) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = i + 1;
            }
            Arrays.sort(arr, Comparator.comparingLong(a -> a[0]));
            boolean flag = false;
            for (int i = 0; i < N - 2; i++) {
                long temp1 = arr[i][0];
                long temp2 = arr[i + 1][0];
                long temp3 = arr[i + 2][0];
                long temp4 = arr[i][1];
                long temp5 = arr[i + 1][1];
                long temp6 = arr[i + 2][1];
                if (temp1 + temp2 != temp3) {
                    System.out.println(temp4 + " " + temp5 + " " + temp6);
                    flag = true;
                    break;
                } else if (temp1 != 0 || temp2 != 0 || temp3 != 0) {
                    System.out.println(temp5 + " " + temp6 + " " + temp4);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
        }
    }
}
