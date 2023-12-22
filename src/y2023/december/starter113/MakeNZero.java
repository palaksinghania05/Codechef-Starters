package y2023.december.starter113;

import java.util.Scanner;

public class MakeNZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int flag = 0;
            if (N % 4 == 3 || (N % 4 == 2 && N >= 6) || (N % 4 == 1 && N >= 9) || N % 4 == 0) {
                flag = 1;
            }
            if (flag == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            T--;
        }
    }
}
