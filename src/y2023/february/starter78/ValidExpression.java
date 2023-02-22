package y2023.february.starter78;

import java.util.Scanner;

public class ValidExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            if ((X > N + 1) || (X < 0 && Math.abs(X) >= N))
                System.out.println(-1);
            else {
                int count = 1;
                if (X > 0) {
                    for (int i = 0; i < N; i++) {
                        if (count != X) {
                            System.out.print('+');
                            count++;
                            continue;
                        }
                        System.out.print('*');
                    }
                    System.out.println();
                } else {
                    for (int i = 0; i < N; i++) {
                        if (count != X) {
                            System.out.print('-');
                            count--;
                            continue;
                        }
                        System.out.print('*');
                    }
                    System.out.println();
                }
            }
            T--;
        }
    }
}
