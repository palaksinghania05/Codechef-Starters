package y2023.may.starter90;

import java.util.Scanner;

public class PrintBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (arr[i] == 0)
                    arr[i] = 1;
                else
                    arr[i] = 0;
            }
            for (int i : arr)
                System.out.print(i + " ");
            System.out.println();
            T--;
        }
    }
}
