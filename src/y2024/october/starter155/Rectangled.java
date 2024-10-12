package y2024.october.starter155;

import java.util.Scanner;

public class Rectangled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N < 4) {
                System.out.println(0);
            } else if (N == 4) {
                System.out.println(1);
            } else {
                if (N % 2 != 0) {
                    N--;
                }
                N /= 2;
                int temp1 = 0;
                int temp2 = (N) / (2);
                temp1 = temp2 * (N - temp2);
                System.out.println(temp1);
            }
            T--;
        }
    }
}
