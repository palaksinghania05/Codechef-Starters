package y2023.november.starter110;

import java.util.Scanner;

public class Marbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int result = 0;
            if (B > A) {
                while (A % B != 0) {
                    A++;
                    B--;
                    result++;
                }
            } else {
                int temp = 0;
                int a1 = A, b1 = B;
                while (a1 % b1 != 0) {
                    a1++;
                    b1--;
                    temp++;
                    if (a1 % b1 == 0) {
                        result = temp;
                    }
                }
                a1 = A;
                temp = 0;
                b1 = B;
                while (a1 % b1 != 0) {
                    a1--;
                    b1++;
                    temp++;
                    if (a1 % b1 == 0) {
                        result = Math.min(result, temp);
                    }
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
