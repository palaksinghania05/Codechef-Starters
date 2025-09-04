package y2025.september.starter202;

import java.util.Scanner;

public class EndlessPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int H = sc.nextInt();
        int result = (X - 4) * 24 + H;
        System.out.println(result);
    }
}
