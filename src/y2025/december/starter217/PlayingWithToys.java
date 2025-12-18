package y2025.december.starter217;

import java.util.Scanner;

public class PlayingWithToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int toys = M - N;
        if (toys < 0) {
            System.out.println("0");
        } else {
            System.out.println(toys);
        }
    }
}
