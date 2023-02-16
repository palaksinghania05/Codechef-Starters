package y2023.february.starter77;

import java.util.Scanner;

public class CodechefAirlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            System.out.println(Math.min(Y, X * 10) * Z);
            T--;
        }
    }
}
