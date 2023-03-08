package y2023.march.starter80;

import java.util.Scanner;

public class JustOneMoreEpisode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            if (X > 24)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
