package y2024.march.starter126;

import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long temp = 0;
            long result = 0;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                temp += ele;
                if (temp + ele > result)
                    result = temp + ele;
            }
            System.out.println(result);
            T--;
        }
    }
}
