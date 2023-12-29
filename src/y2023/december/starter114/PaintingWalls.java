package y2023.december.starter114;

import java.util.Scanner;

public class PaintingWalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int result = (Z / 2) / (X * Y);
            System.out.println(result);
            T--;
        }
    }
}
