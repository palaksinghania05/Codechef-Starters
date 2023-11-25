package y2023.november.starter109;

import java.util.Scanner;

public class BestOfNSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int temp1 = X + Y;
            int count1 = (Math.max(X, Y) - (Math.min(X, Y)));
            if (count1 % 2 == 0) {
                count1 = count1 + 1;
            }
            int temp2 = count1 - 2;
            int count2 = temp1 + temp2;
            if (count2 % 2 == 0) {
                count2 = count2 + 1;
            }
            System.out.println(count2);
            T--;
        }
    }
}
