package y2024.november.starter159;

import java.util.Arrays;
import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                if (arr[i] > temp)
                    arr[i] = 0;
                else
                    arr[i] = temp - arr[i] + 1;
            }
            Arrays.sort(arr);
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] == 0)
                    count++;
                else {
                    if (X >= arr[i]) {
                        X -= arr[i];
                        count++;
                    } else {
                        break;
                    }
                }
            }
            if (count > N / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
