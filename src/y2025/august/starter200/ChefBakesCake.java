package y2025.august.starter200;

import java.util.Scanner;

public class ChefBakesCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int temp = Y / X;
        if (N % temp == 0) System.out.println(N / temp);
        else System.out.println(N / temp + 1);
    }
}
