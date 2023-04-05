package y2023.april.starter84;

import java.util.Scanner;

public class ElectionsInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[N];
            int result = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (arr[i] >= X)
                    result++;
            }
            System.out.println(result);
            T--;
        }
    }
}
