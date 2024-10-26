package y2024.october.starter157;

import java.util.Arrays;
import java.util.Scanner;

public class NotTooFarReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N + 1];
            int sum = 0;
            for (int i = 0; i < N + 1; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int lastIndex = arr[N];
            Arrays.sort(arr);
            for (int i = 0; i < N + 1; i++) {
                if (arr[i] > lastIndex && arr[i] <= 2 * lastIndex) {
                    lastIndex = arr[i];
                }
            }
            System.out.println(sum - lastIndex);
            T--;
        }
    }
}
