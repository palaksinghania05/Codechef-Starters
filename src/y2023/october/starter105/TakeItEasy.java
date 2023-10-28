package y2023.october.starter105;

import java.util.Scanner;

public class TakeItEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int b = sum / N;
            if (b * N != sum) {
                System.out.println("No");
            } else {
                int flag = 0;
                for (int i = 0; i < N; i++) {
                    if ((Math.abs(arr[i] - b)) % 2 == 0) {
                        flag++;
                    } else
                        flag -= 1;
                }
                if (flag == N)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            T--;
        }
    }
}
