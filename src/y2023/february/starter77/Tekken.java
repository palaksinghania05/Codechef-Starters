package y2023.february.starter77;

import java.util.Scanner;

public class Tekken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (Math.abs(B - C) < A)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
