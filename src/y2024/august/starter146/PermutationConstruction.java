package y2024.august.starter146;

import java.util.Scanner;

public class PermutationConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int temp = N / 2 + 1;
            if (N % 2 != 0)
                temp++;
            for (int i = 1; i <= N / 2; i++, temp++) {
                System.out.print(i + " " + temp + " ");
            }
            if (N % 2 != 0)
                System.out.print(N / 2 + 1);
            System.out.println();
            T--;
        }
    }
}
