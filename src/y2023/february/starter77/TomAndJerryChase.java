package y2023.february.starter77;

import java.util.Scanner;

public class TomAndJerryChase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X < Y)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
