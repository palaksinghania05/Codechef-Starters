package y2023.may.starter92;

import java.util.Scanner;

public class WaterFilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();
            int bottles = 0;
            if (B1 == 1)
                bottles++;
            if (B2 == 1)
                bottles++;
            if (B3 == 1)
                bottles++;
            if (bottles < 2)
                System.out.println("Water Filling Time");
            else
                System.out.println("Not Now");
            T--;
        }
    }
}
