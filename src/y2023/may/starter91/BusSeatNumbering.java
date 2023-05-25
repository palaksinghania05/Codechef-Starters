package y2023.may.starter91;

import java.util.Scanner;

public class BusSeatNumbering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N <= 10) {
                System.out.println("Lower Double");
            } else if (N <= 15) {
                System.out.println("Lower Single");
            } else if (N <= 25) {
                System.out.println("Upper Double");
            } else {
                System.out.println("Upper Single");
            }
            T--;
        }
    }
}
