package y2025.january.starter171;

import java.util.Scanner;

public class WhiteWall {
    public static void main(String[] args) {
        String[] flag = new String[]{"RGB", "GBR", "BRG", "RBG", "GRB", "BGR"};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int[] temp = new int[6];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 6; j++) {
                    if (S.charAt(i) != flag[j].charAt(i % 3)) {
                        temp[j]++;
                    }
                }
            }
            int result = Integer.MAX_VALUE;
            for (int i = 0; i < 6; i++) {
                result = Math.min(result, temp[i]);
            }
            System.out.println(result);
            T--;
        }
    }
}
