package y2024.august.starter146;

import java.util.Scanner;

public class KnockoutTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] arr = new int[16];
            for (int i = 0; i < 16; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < 16; i++) {
                int count = 0;
                for (int j = 0; j < 16; j++) {
                    if (arr[i] > arr[j]) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.print("0 ");
                } else if (count == 1 || count == 2) {
                    System.out.print("1 ");
                } else if (count > 2 && count < 7) {
                    System.out.print("2 ");
                } else if (count >= 7 && count < 15) {
                    System.out.print("3 ");
                } else {
                    System.out.print("4 ");
                }
            }
            T--;
        }
    }
}
