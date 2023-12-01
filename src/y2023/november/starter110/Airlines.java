package y2023.november.starter110;

import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int x = sc.nextInt(); // number of aircraft
            int n = sc.nextInt(); // number of passengers
            int planesNeeded = (n + 99) / 100;
            int additionalPlanes = planesNeeded - x;
            System.out.println(Math.max(0, additionalPlanes));
            T--;
        }
    }
}
