package y2025.march.starter176;

import java.util.Scanner;

public class ClothingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
            int result = 0;
            int temp1 = Math.min(Z, C);
            result += temp1;
            Z -= temp1;
            int temp2 = Math.min(Y + Z, B);
            result += temp2;
            int temp3 = Y + Z;
            temp3 -= temp2;
            int temp4 = Math.min(X + temp3, A);
            result += temp4;
            System.out.println(result);
        }
    }
}
