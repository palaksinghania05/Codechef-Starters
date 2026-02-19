package y2026.feb.starter226;

import java.util.Scanner;

public class RushToExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A = sc.nextInt();
        if (N * A >= M) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
