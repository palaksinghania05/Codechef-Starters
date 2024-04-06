package y2024.april.starter128;

import java.util.Arrays;
import java.util.Scanner;

public class MeximizeTheArray {
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
            long result = 0;
            for (int i = 0; i < N; i++) {
                if (i == arr[i])
                    continue;
                result += Math.abs(i - arr[i]);
            }
            System.out.println(result);
            T--;
        }
    }
}
