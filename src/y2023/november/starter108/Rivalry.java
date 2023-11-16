package y2023.november.starter108;

import java.util.Scanner;

public class Rivalry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int R2 = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();

        int x = R1 + D1;
        int y = R2 + D2;
        if (x > y) {
            System.out.println("Dominater");
        } else {
            System.out.println("Everule");
        }
    }
}
