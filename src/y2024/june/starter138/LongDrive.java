package y2024.june.starter138;

import java.util.Scanner;

public class LongDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            double temp = (10.0 * (Y - X)) / (100 - Y);
            int min = (int) Math.ceil(temp);
            System.out.println(min);
            T--;
        }
    }
}
