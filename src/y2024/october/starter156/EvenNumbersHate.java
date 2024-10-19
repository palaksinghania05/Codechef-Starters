package y2024.october.starter156;

import java.util.Scanner;

public class EvenNumbersHate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int oddCount = 0;
            int evenCount = 0;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (ele % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            if (oddCount == 0) {
                System.out.println(0);
            } else {
                System.out.println(((oddCount + 1) / 2) + evenCount);
            }
            T--;
        }
    }
}
