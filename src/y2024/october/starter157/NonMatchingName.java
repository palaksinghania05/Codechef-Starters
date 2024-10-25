package y2024.october.starter157;

import java.util.Scanner;

public class NonMatchingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();
            String Sa = sc.nextLine();
            String Sb = sc.nextLine();
            int[] tempArr = new int[26];
            for (char ch : Sa.toCharArray()) {
                tempArr[ch - 'a']++;
            }
            for (char ch : Sb.toCharArray()) {
                tempArr[ch - 'a']++;
            }
            boolean flag = false;
            for (int i = 0; i < 26; i++) {
                if (tempArr[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            T--;
        }
    }
}
