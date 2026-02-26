package y2026.feb.starter227;

import java.util.Scanner;

public class Fonta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char ch1 = S.charAt(2);
        char ch2 = S.charAt(3);
        char ch3 = S.charAt(4);
        if (ch1 == 'n' && ch2 == 't' && ch3 == 'a')
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
