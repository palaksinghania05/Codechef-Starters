package y2024.july.starter145;

import java.util.Scanner;

public class VolumeComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        if ((A * B * C) > (X * X * X)) {
            System.out.println("Cuboid");
        } else if ((A * B * C) < (X * X * X)) {
            System.out.println("Cube");
        } else {
            System.out.println("Equal");
        }
    }
}
