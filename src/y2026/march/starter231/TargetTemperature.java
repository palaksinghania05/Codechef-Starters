package y2026.march.starter231;

import java.util.Arrays;
import java.util.Scanner;

public class TargetTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag = false;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] == arr[i + 1] && arr[i] != arr[N - 1]) {
                    System.out.println("No");
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.println("Yes");
        }
    }
}
