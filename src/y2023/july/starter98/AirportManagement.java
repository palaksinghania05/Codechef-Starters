package y2023.july.starter98;

import java.util.Scanner;

public class AirportManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] D = new int[N];
            int[] freq = new int[1440];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                freq[A[i]]++;
            }
            for (int i = 0; i < N; i++) {
                D[i] = sc.nextInt();
                freq[D[i]]++;
            }
            int count = 0;
            for (int i = 0; i < 1440; i++) {
                count = Math.max(count, freq[i]);
            }
            System.out.println(count);
            T--;
        }
    }
}
