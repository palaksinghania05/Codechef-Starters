package y2024.july.starter141;

import java.util.Scanner;

public class LuckyClover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N - 1;
        System.out.print(4 + 3 * temp);
    }
}
