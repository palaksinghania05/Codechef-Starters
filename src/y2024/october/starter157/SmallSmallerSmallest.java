package y2024.october.starter157;

import java.util.Scanner;

public class SmallSmallerSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            int count = 0;
            for (char i : S.toCharArray()) {
                if (i == '1') {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(N);
            } else {
                if (count % 2 == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }
            T--;
        }
    }
}
