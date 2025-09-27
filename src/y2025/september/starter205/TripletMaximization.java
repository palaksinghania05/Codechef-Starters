package y2025.september.starter205;

import java.util.Scanner;

public class TripletMaximization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(2 * Math.min((X + Y) / 3, Y) + Math.max(((X + Y) / 3 - Y), 0));
        }
    }
}
