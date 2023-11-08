package y2023.november.starter107;

import java.util.Scanner;

public class ClearDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 7;
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.print(N - B - C);
    }
}
