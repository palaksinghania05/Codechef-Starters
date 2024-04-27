package y2024.april.starter131;

import java.util.Arrays;
import java.util.Scanner;

public class DiceDeception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int count = 0;
            for (int i = 0; i < N; i++) {
                count++;
                arr[i] = Math.max(7 - arr[i], arr[i]);
                if (count == K)
                    break;
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                result += arr[i];
            }
            System.out.println(result);
            T--;
        }
    }
}
