package y2024.august.starter149;

import java.util.Scanner;

public class ApproximateAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int K = sc.nextInt();
        int temp = Math.abs(X - Y);
        if (temp <= K) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
