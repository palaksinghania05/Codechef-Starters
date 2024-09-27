package y2024.september.starter153;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[3][N];
        for (int i = 0; i < N; i++) {
            arr[0][i] = sc.nextInt();
            arr[1][i] = sc.nextInt();
            arr[2][i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if ((arr[1][i] - arr[0][i]) == (arr[2][i] - arr[1][i])) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
