package y2025.january.starter169;

import java.util.Scanner;

public class EntryCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
