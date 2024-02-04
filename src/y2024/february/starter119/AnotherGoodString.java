package y2024.february.starter119;

import java.util.ArrayList;
import java.util.Scanner;

public class AnotherGoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            char ch = S.charAt(0);
            int count = 1, max = 1;
            for (int i = 1; i < N; i++) {
                if (ch == S.charAt(i)) {
                    ch = S.charAt(i);
                    count++;
                    max = Math.max(count, max);
                } else {
                    ch = S.charAt(i);
                    count = 1;
                }
            }
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(max);
            for (int i = 0; i < K; i++) {
                char tempChar = sc.next().charAt(0);
                if (tempChar == ch) {
                    count++;
                    ch = tempChar;
                    max = Math.max(count, max);
                } else {
                    ch = tempChar;
                    count = 1;
                }
                arr.add(max);
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            T--;
        }
    }
}
