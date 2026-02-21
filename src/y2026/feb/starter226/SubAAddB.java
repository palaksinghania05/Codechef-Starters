package y2026.feb.starter226;

import java.util.Scanner;

public class SubAAddB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- != 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            while (N >= A) {
                N -= (A - B);
            }
            System.out.println(N);
        }
    }
}
