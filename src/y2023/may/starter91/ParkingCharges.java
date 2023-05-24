package y2023.may.starter91;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int H = sc.nextInt();
        System.out.println(X + (H - 1) * Y);
    }
}
