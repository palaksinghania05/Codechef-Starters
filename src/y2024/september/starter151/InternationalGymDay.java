package y2024.september.starter151;

import java.util.Scanner;

public class InternationalGymDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int D = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (Y >= X)
                System.out.println(0);
            else {
                int count = 0;
                int temp = D;
                boolean found = false;
                while (Y > 0) {
                    Y--;
                    double sum = (double) Y + (D / 100.0) * (X);
                    count++;
                    if (sum >= X) {
                        found = true;
                        break;
                    }
                    D += temp;
                }
                if (found)
                    System.out.println(count);
                else
                    System.out.println(-1);
            }
            T--;
        }
    }
}
