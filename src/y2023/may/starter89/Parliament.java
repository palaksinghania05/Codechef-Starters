package y2023.may.starter89;

import java.util.Scanner;

public class Parliament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            if (X >= (N / 2.0))
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
