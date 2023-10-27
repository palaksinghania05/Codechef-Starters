package y2023.october.starter105;

import java.util.Scanner;

public class DraculaEats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int i = 2;
            int result = 0;
            if (N == 1) {
                System.out.println(0);
            } else {
                while (i <= N) {
                    result = result + 1;
                    i = i + 7;
                }
                System.out.println(result);
            }
            T--;
        }
    }
}
