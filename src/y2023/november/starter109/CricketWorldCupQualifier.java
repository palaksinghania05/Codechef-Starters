package y2023.november.starter109;

import java.util.Scanner;

public class CricketWorldCupQualifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 12)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
