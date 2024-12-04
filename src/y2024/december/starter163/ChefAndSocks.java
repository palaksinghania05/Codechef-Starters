package y2024.december.starter163;

import java.util.Scanner;

public class ChefAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X + Y >= A) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
