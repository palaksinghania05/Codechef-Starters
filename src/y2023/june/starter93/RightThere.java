package y2023.june.starter93;

import java.util.Scanner;

public class RightThere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            if (N <= X)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
