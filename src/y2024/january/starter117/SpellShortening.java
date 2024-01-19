package y2024.january.starter117;

import java.util.Scanner;

public class SpellShortening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int temp;
            for (temp = 0; temp < N - 1; temp++) {
                if (S.charAt(temp) > S.charAt(temp + 1)) {
                    break;
                }
            }
            for (int i = 0; i < N; i++) {
                if (temp != i) {
                    System.out.print(S.charAt(i));
                }
            }
            System.out.println();
            T--;
        }
    }
}
