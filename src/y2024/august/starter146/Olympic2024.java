package y2024.august.starter146;

import java.util.Scanner;

public class Olympic2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int G = sc.nextInt();
        int S = sc.nextInt();
        int B = sc.nextInt();
        int total = 5;
        int result = total - G + total - S + total - B;
        System.out.println(result);
    }
}
