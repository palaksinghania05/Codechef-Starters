package y2026.jan.starter222;

import java.util.Scanner;

public class PopcornBuying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int result = (X - 100) / 50;
        System.out.println(result);
    }
}
