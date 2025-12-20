package y2025.december.starter217;

import java.util.Scanner;

public class Add1Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (M >= N && (M - N) % 2 == 0 && (M - N) / 2 <= N) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
