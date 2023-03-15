package y2023.march.starter81;

import java.util.Scanner;

public class MaximumCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X > 8)
                System.out.println("NO");
            else {
                if (X * Y <= 500)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            T--;
        }
    }
}
