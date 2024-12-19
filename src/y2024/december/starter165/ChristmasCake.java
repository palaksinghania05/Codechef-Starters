package y2024.december.starter165;

import java.util.Scanner;

public class ChristmasCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int numberOfCakes = 24 - X + 1;
        System.out.println(numberOfCakes);
    }
}
