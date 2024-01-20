package y2024.january.starter117;

import java.util.Scanner;

public class WeaponChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            double H = sc.nextInt();
            double X = sc.nextInt();
            double Y1 = sc.nextInt();
            double Y2 = sc.nextInt();
            double K = sc.nextInt();
            double temp1 = H / X;
            double flag1 = Math.ceil(temp1);
            double temp2 = H - (Y1 * K);
            double flag2 = 0;
            if (temp2 <= 0) {
                double x = H / Y1;
                flag2 = Math.ceil(x);
            } else if (temp2 > 0) {
                double x = temp2 / Y2;
                flag2 = Math.ceil(x + K);
            }
            if (flag2 > flag1) {
                System.out.println((int) flag1);
            } else {
                System.out.println((int) flag2);
            }
            T--;
        }
    }
}
