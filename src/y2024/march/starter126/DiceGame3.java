package y2024.march.starter126;

import java.util.Scanner;

public class DiceGame3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int temp = N / 2;
            int result = 0;
            if (N % 2 == 0)
                result = temp * 13;
            else
                result = (temp * 13) + 6;
            System.out.println(result);
            T--;
        }
    }
}
