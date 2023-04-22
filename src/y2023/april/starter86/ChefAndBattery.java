package y2023.april.starter86;

import java.util.Scanner;

public class ChefAndBattery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int count = 0;
            while (N != 50) {
                if (N > 50) {
                    N -= 3;
                    count++;
                }
                if (N < 50) {
                    N += 2;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
