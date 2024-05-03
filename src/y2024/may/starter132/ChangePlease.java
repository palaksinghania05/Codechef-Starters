package y2024.may.starter132;

import java.util.Scanner;

public class ChangePlease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int temp = 100 - X;
            temp -= (temp % 10);
            System.out.println(temp);
            T--;
        }
    }
}
