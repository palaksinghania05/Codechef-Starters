package y2025.september.starter203;

import java.util.Scanner;

public class PassingGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] M = new int[N];
            for (int i = 0; i < N; i++) {
                M[i] = sc.nextInt();
            }
            int temp = M[0];
            int temp2 = 0;
            for (int i = 0; i < N; i++) {
                if (M[i] >= temp)
                    temp2++;
            }
            System.out.println(temp2);
        }
        sc.close();
    }
}
