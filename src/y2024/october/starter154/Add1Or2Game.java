package y2024.october.starter154;

import java.util.Scanner;

public class Add1Or2Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N == 1) {
                System.out.println("ALICE");
            } else {
                System.out.println("BOB");
            }
            T--;
        }
    }
}
