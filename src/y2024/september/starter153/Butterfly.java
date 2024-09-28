package y2024.september.starter153;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0) {
            int R = scanner.nextInt();
            int G = scanner.nextInt();
            int B = scanner.nextInt();
            int maxButterflies = Math.max(R, Math.max(G, B));
            int sumOfOtherColors = R + G + B - maxButterflies;
            if (maxButterflies > sumOfOtherColors) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            T--;
        }
    }
}
