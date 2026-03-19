package y2026.march.starter230;

import java.util.Scanner;

public class EqualBuying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
