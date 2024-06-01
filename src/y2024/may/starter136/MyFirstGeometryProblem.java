package y2024.may.starter136;

import java.util.Scanner;

public class MyFirstGeometryProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String S = sc.next();
            char[] ch = S.toCharArray();
            int X = 1, Y = 1;
            if (ch[0] == '1') {
                X = X + 10;
            }
            if (ch[1] == '1') {
                X = X + 10;
            }
            if (ch[2] == '1') {
                Y = Y + 10;
            }
            if (ch[3] == '1') {
                Y = Y + 10;
            }
            System.out.println(X * Y);
            T--;
        }
    }
}
