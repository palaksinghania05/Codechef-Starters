package y2024.november.starter160;

import java.util.Scanner;

public class MovieSnacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int temp1 = 2 * X + 3 * Y;
        int temp2 = 2 * Z + Y;
        int temp3 = Z + X + 2 * Y;
        int result = Math.min(temp1, Math.min(temp2, temp3));
        System.out.println(result);
        sc.close();
    }
}
