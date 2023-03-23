package y2023.march.starter82;

import java.util.Scanner;

public class MinToMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            int count = 0;
            int min = arr[0];
            for (int i : arr)
                min = Math.min(min, i);
            for (int i : arr)
                if (i > min)
                    count++;
            System.out.println(count);
            T--;
        }
    }
}
