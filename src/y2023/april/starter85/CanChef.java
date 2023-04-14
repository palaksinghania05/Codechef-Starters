package y2023.april.starter85;

import java.util.Scanner;

public class CanChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (15 * X >= 2 * Y)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
