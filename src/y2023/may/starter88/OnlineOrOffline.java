package y2023.may.starter88;

import java.util.Scanner;

public class OnlineOrOffline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            float N = sc.nextFloat();
            float M = sc.nextFloat();
            float discount = (N * 10) / 100;
            if ((N - discount) < M) {
                System.out.println("ONLINE");
            } else if ((N - discount) > M) {
                System.out.println("DINING");
            } else if ((N - discount) == M) {
                System.out.println("EITHER");
            }
            T--;
        }
    }
}
