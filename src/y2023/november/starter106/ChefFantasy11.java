package y2023.november.starter106;

import java.util.Scanner;

public class ChefFantasy11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(N * (N - 1));
            T--;
        }
    }
}
