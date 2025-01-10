package y2025.january.starter168;

import java.util.Scanner;

public class BigAchiever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                if (arr[i] > max) {
                    System.out.print(1 + " ");
                    max = arr[i];
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
            T--;
        }
    }
}
