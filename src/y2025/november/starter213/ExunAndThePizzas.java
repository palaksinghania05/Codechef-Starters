package y2025.november.starter213;

import java.util.Scanner;

public class ExunAndThePizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        System.out.println((N - K) * R);
    }
}
