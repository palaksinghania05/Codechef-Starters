package y2024.october.starter156;

import java.util.Scanner;

public class EvenNumbersHate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int T = 0; T < t; T++) {
            int n = sc.nextInt();
            int countO = 0;
            int countE = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    countE++;
                } else {
                    countO++;
                }
            }
            if (countO == 0) {
                System.out.println(0);
            } else {
                System.out.println(((countO + 1) / 2) + countE);
            }
        }
    }
}
