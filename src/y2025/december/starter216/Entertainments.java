package y2025.december.starter216;

import java.util.Scanner;

public class Entertainments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N <= 5) {
            System.out.println(N * 200);
        } else {
            System.out.println("1000");
        }
    }
}
