package y2024.june.starter140;

import java.util.Arrays;
import java.util.Scanner;

public class MakePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                if (arr[i] > (i + 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
