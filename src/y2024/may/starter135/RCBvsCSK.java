package y2024.may.starter135;

import java.util.Scanner;

public class RCBvsCSK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if ((X - Y) >= 18) {
            System.out.println("RCB");
        } else {
            System.out.println("CSK");
        }
    }
}
