package y2025.october.starter208;

import java.util.Arrays;
import java.util.Scanner;

public class GCND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int higest = arr[N - 1];
            int lowest = arr[0];
            int result = higest - 1;
            if (higest - lowest == 1) {
                System.out.println(higest - 2);
                continue;
            }
            System.out.println(result);
        }
    }
}
