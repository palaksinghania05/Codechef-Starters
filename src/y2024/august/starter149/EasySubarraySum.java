package y2024.august.starter149;

import java.util.Scanner;

public class EasySubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            int first = -1;
            int last = -1;
            for (int i = 0; i < N; i++) {
                if (first == -1 && arr[i] > 0)
                    first = i;
                if (arr[i] > 0)
                    last = i;
            }
            int result = 0;
            if (first == -1 && last == -1)
                result = 0;
            else {
                for (int i = first; i <= last; i++)
                    result += (arr[i] < 0) ? 1 : 0;
            }
            System.out.println(result);
            T--;
        }
        sc.close();
    }
}
