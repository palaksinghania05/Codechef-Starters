package y2024.february.starter121;

import java.util.Scanner;

public class TheManCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(((N + 1) / 2) + " " + (N + 2) / 3);
            T--;
        }
    }
}
