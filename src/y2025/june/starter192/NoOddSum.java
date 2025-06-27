package y2025.june.starter192;

import java.util.Scanner;

public class NoOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int temp1 = 0, temp2 = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] == 1)
                    temp1++;
                else
                    temp2++;
            }
            if (temp1 == 0 || temp2 == 0)
                System.out.println("0");
            else if (temp1 % 2 != 0) {
                System.out.println(temp2);
            } else
                System.out.println(Math.min(temp1 / 2, temp2));
        }
    }
}
