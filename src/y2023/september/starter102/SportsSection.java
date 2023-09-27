package y2023.september.starter102;

import java.util.Scanner;

public class SportsSection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X == 8 || X == 9 || X == 10)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
