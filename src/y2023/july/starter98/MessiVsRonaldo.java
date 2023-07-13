package y2023.july.starter98;

import java.util.Scanner;

public class MessiVsRonaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (2 * A + B > X * 2 + Y)
            System.out.println("Messi");
        else if (2 * A + B < X * 2 + Y)
            System.out.println("Ronaldo");
        if (2 * A + B == X * 2 + Y)
            System.out.println("Equal");
    }
}
