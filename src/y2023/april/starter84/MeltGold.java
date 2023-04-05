package y2023.april.starter84;

import java.util.Scanner;

public class MeltGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int i = 1;
            while (true) {
                if (Y + i >= X)
                    break;
                else {
                    Y = Y + i;
                    i++;
                }
            }
            System.out.println(i);
            T--;
        }
    }
}
