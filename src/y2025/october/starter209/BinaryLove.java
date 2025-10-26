package y2025.october.starter209;

import java.util.Scanner;

public class BinaryLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- != 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int temp1 = 0;
            int temp2 = 0;
            for (int i = 0; i < N - 1; i++) {
                String s1 = S.substring(i, i + 2);
                if (s1.equals("10"))
                    temp2++;
                else if (s1.equals("01"))
                    temp1++;
            }
            if (temp1 > 0 && temp2 > 0)
                System.out.println("Alice");
            else if (temp1 == 0 || temp2 == 0)
                System.out.println("Bob");
        }
    }
}
