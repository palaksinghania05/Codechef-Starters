package y2023.november.starter106;

import java.util.Scanner;

public class FanPoll {
    public static void main(String[] args) {
        int X, Y, Z;
        Scanner s = new Scanner(System.in);
        X = s.nextInt();
        Y = s.nextInt();
        Z = s.nextInt();
        if (X > Y && X > Z)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
