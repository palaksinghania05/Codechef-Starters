package y2023.april.starter87;

import java.util.Scanner;

public class FourTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            if (4 * X <= 1000)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
