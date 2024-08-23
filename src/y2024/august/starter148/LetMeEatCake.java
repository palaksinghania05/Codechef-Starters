package y2024.august.starter148;

import java.util.Scanner;

public class LetMeEatCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int result = 0;
            while (A != B) {
                if (A > B) {
                    int temp = (A + 1) / 2;
                    result += temp;
                    A -= temp;
                } else {
                    int temp = (B + 1) / 2;
                    result += temp;
                    B -= temp;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
