package y2023.december.starter114;

import java.util.Scanner;

public class ChristmasGreetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X == 25) {
            System.out.println("CHRISTMAS");
        } else {
            System.out.println("ORDINARY");
        }
    }
}
