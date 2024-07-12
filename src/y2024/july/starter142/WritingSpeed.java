package y2024.july.starter142;

import java.util.Scanner;

public class WritingSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X * 5 <= 60) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
