package y2023.july.starter97;

import java.util.Arrays;
import java.util.Scanner;

public class BestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int alice[] = new int[3];
            int bob[] = new int[3];
            for (int i = 0; i < 3; i++) {
                alice[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                bob[i] = sc.nextInt();
            }
            Arrays.sort(alice);
            Arrays.sort(bob);
            int a = alice[1] + alice[2];
            int b = bob[1] + bob[2];
            if (a > b) {
                System.out.println("Alice");
            } else if (b > a) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
            T--;
        }
    }
}
