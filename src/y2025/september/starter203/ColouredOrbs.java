package y2025.september.starter203;

import java.util.Scanner;

public class ColouredOrbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int B = sc.nextInt();
        if (R == B) {
            System.out.println(R * 5);
        } else if (R > B) {
            System.out.println((B * 5) + (R - B));
        } else {
            System.out.println((R * 5) + ((B - R) * 2));
        }
    }
}
