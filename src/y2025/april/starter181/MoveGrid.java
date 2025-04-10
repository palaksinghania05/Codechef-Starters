package y2025.april.starter181;

import java.util.Scanner;

public class MoveGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int finalX = A - C;
        int finalY = B - D;
        System.out.println(finalX + " " + finalY);
    }
}
