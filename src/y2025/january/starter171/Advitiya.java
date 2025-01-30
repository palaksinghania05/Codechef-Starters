package y2025.january.starter171;

import java.util.Scanner;

public class Advitiya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String target = "ADVITIYA";
        while (T > 0) {
            String S = sc.nextLine().toUpperCase();
            int result = 0;
            for (int i = 0; i < 8; i++) {
                int char1 = S.charAt(i);
                int char2 = target.charAt(i);
                if (char1 <= char2) {
                    result += (char2 - char1);
                } else {
                    result += (26 - (char1 - char2));
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
