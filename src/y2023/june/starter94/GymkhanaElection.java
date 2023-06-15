package y2023.june.starter94;

import java.util.Scanner;

public class GymkhanaElection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println((M / 2) + 1);
            T--;
        }
    }
}
