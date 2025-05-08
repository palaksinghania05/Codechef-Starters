package y2025.may.starter185;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
