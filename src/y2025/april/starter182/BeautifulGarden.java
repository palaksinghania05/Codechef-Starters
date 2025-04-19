package y2025.april.starter182;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int D = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int result = 0;
            for (int i = 0; i < N - K; i++) {
                result += 1 + (D - 1) / arr[i];
            }
            System.out.println(result);
        }
    }
}
