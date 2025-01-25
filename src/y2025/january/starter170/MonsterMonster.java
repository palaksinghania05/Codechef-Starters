package y2025.january.starter170;

import java.util.Arrays;
import java.util.Scanner;

public class MonsterMonster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long X = sc.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int temp = 0;
            for (int i = N - 1; i >= 0; i--) {
                arr[i] = arr[i] + ((temp) * X);
                temp++;
            }
            Arrays.sort(arr);
            System.out.println(arr[N - 1]);
            T--;
        }
    }
}
