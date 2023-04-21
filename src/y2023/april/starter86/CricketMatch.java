package y2023.april.starter86;

import java.util.Scanner;

public class CricketMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (M * 36 >= N)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
