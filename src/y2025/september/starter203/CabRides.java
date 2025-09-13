package y2025.september.starter203;

import java.util.Scanner;

public class CabRides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int cab = N / 3;
            int price = cab * 300;
            if (N == 1) {
                System.out.println(200);
            } else if (N % 3 == 1) {
                System.out.println(price + 100);
            } else if (N % 3 == 2) {
                System.out.println(price + 200);
            } else {
                System.out.println(price);
            }
        }
    }
}
