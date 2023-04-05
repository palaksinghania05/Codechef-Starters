package y2023.april.starter84;

import java.util.Scanner;

public class ChefAndDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(Y - X);
            T--;
        }
    }
}
