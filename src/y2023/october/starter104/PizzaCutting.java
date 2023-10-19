package y2023.october.starter104;

import java.util.Scanner;

public class PizzaCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            if (X == 1) {
                System.out.println("YES");
            } else if (X % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
