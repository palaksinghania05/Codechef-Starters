package y2024.february.starter121;

import java.util.Scanner;

public class CeaserCipherLite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String P = sc.next();
            String C = sc.next();
            int[] arr = new int[N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                char char1 = P.charAt(i);
                char char2 = C.charAt(i);
                while (char1 != char2) {
                    char1 += 3;
                    if (char1 > 90) {
                        char1 = (char) (char1 - 26);
                    }
                    count++;
                }
                arr[i] = count;
                count = 0;
            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            T--;
        }
    }
}
