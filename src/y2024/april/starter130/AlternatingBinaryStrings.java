package y2024.april.starter130;

import java.util.Scanner;

public class AlternatingBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            int result = 0;
            int i = 1;
            while (i < N) {
                result += (S.charAt(i) == S.charAt(i - 1)) ? 1 : 0;
                i++;
            }
            System.out.println(result);
            T--;
        }
    }
}
