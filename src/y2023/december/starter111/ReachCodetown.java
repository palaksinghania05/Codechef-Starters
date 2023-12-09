package y2023.december.starter111;

import java.util.Scanner;

public class ReachCodetown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String S = sc.nextLine();
            char arr[] = S.toCharArray();
            boolean isVowel[] = {false, true, false, true, false, true, false, false};
            boolean isValid = true;
            for (int i = 0; i < 8; i++) {
                if ("AEIOU".contains(String.valueOf(arr[i])) != isVowel[i]) {
                    isValid = false;
                    break;
                }
            }
            System.out.println((isValid ? "YES" : "NO"));
            T--;
        }
    }
}
