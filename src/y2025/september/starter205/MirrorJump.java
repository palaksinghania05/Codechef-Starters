package y2025.september.starter205;

import java.util.Scanner;

public class MirrorJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(Math.min(N - K, K));
        }
    }
}
