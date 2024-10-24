package y2024.october.starter157;

import java.util.Scanner;

public class GlassPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (2 * X < Y) {
            System.out.println("PLASTIC");
        } else {
            System.out.println("METAL");
        }
    }
}
