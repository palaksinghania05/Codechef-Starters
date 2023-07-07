package y2023.july.starter97;

import java.util.Scanner;

public class CaeserCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            char[] A = sc.next().toCharArray();
            char[] B = sc.next().toCharArray();
            char[] C = sc.next().toCharArray();
            for (int j = 0; j < N; j++) {
                int ele = B[j] - A[j] + C[j];
                if (ele >= 97 & ele <= 122)
                    System.out.print((char) ele);
                else if (ele > 122)
                    System.out.print((char) (ele - 26));
                else
                    System.out.print((char) (ele + 26));
            }
            System.out.println();
            T--;
        }
    }
}
