package y2023.october.starter103;

import java.util.Scanner;

public class SundayBrunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X / Y > 20)
                System.out.println(20);
            else
                System.out.println(X / Y);
            T--;
        }
    }
}
