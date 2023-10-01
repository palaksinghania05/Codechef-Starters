package y2023.september.starter102;

import java.util.Scanner;

public class ChefAndStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int min = arr[0];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                sum = sum + arr[i];
            }
            System.out.println(sum - min);
            T--;
        }
    }
}
