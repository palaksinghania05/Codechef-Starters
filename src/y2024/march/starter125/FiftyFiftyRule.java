package y2024.march.starter125;

import java.util.Scanner;

public class FiftyFiftyRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X < 50) {
                System.out.println("Z");
            } else {
                if (Y < 50) {
                    System.out.println("F");
                } else {
                    System.out.println("A");
                }
            }
            T--;
        }
    }
}
