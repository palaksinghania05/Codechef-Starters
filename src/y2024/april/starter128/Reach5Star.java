package y2024.april.starter128;

import java.util.Scanner;

public class Reach5Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if ((X + Y) >= 2000)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
