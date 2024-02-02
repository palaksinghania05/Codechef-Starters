package y2024.february.starter119;

import java.util.Scanner;

public class Judged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int count = 0;
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) {
                    count++;
                }
            }
            if (count > 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
