package y2024.october.starter155;

import java.util.Scanner;

public class Rectangled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int inkl = sc.nextInt();
            if (inkl < 4) {
                System.out.println(0);
            } else if (inkl == 4) {
                System.out.println(1);
            } else {
                if (inkl % 2 != 0) {
                    inkl--;
                }
                inkl /= 2;
                int l = 0;
                int b = 0;
                int ma = 0;
                int ml = (inkl) / (2);
                ml = ml / 1;
                ma = ml * (inkl - ml);
                System.out.println(ma);
            }
        }
    }
}
