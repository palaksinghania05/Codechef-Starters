package y2023.may.starter92;

import java.util.Scanner;

public class RectangularTiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int W = sc.nextInt();
            int L = sc.nextInt();
            if ((W * L) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
