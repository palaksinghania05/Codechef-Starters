package y2024.march.starter125;

import java.util.Scanner;

public class Overspeeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        if (S <= 40) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
