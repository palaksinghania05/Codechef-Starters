package y2023.november.starter107;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            int chef = 0, chefina = 0;

            for (int i = 0; i < N; i++) {
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);

                if (ch1 == ch2) {
                    // Do nothing
                } else if (ch1 + ch2 == 'R' + 'S') {
                    if (str1.charAt(i) == 'R') {
                        chef++;
                    } else {
                        chefina++;
                    }
                } else if (ch1 + ch2 == 'S' + 'P') {
                    if (str1.charAt(i) == 'S') {
                        chef++;
                    } else {
                        chefina++;
                    }
                } else if (ch1 + ch2 == 'P' + 'R') {
                    if (str1.charAt(i) == 'P') {
                        chef++;
                    } else {
                        chefina++;
                    }
                }
            }
            int moves = 0;
            if (chefina > chef) {
                while (chefina >= chef) {
                    chef++;
                    chefina--;
                    moves++;
                }
                System.out.println(moves);
            } else if (chefina == chef) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            T--;
        }
    }
}
