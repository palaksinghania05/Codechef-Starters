package y2023.december.starter111;

import java.util.Scanner;

public class T404NotFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X == 404) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("FOUND");
        }
    }
}
