package y2024.april.starter131;

import java.util.Scanner;

public class GottaCatchThemAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int[] arr = new int[N];
            int result = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] * X < Y)
                    result = result + (arr[i] * X);
                else
                    result += Y;
            }
            System.out.println(result);
            T--;
        }
    }
}
