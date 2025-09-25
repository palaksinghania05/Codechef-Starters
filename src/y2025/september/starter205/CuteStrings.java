package y2025.september.starter205;

import java.util.Scanner;

public class CuteStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().toLowerCase();
        if (S.length() == 3 && S.charAt(0) == S.charAt(2) && S.charAt(1) == 'w') {
            System.out.println("Cute");
        } else {
            System.out.println("No");
        }
    }
}
