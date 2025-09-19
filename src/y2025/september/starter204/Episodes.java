package y2025.september.starter204;

import java.util.Scanner;

public class Episodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int temp1 = (N * K) % 60;
            int temp2 = (N * K) / 60;
            System.out.println(temp2 + " " + temp1);
        }
    }
}
