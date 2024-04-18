package y2024.april.starter130;

import java.util.Scanner;

public class GiantWheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 60) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
