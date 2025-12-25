package y2025.december.starter218;

import java.util.Scanner;

public class ChristmasTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int M = sc.nextInt();
        int B = sc.nextInt();
        int result = (M * B) - (N * A);
        System.out.print(result);
    }
}
