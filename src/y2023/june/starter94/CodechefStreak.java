package y2023.june.starter94;

import java.util.Scanner;

public class CodechefStreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int numDays = sc.nextInt();
            int omMax = 0;
            int addyMax = 0;
            int countOm = 0;
            int countAddy = 0;
            for (int i = 0; i < numDays; i++) {
                if (sc.nextInt() > 0) {
                    countOm++;
                } else {
                    if (countOm > omMax) {
                        omMax = countOm;
                    }
                    countOm = 0;
                }
            }
            if (countOm > omMax) {
                omMax = countOm;
            }
            for (int j = 0; j < numDays; j++) {
                if (sc.nextInt() > 0) {
                    countAddy++;
                } else {
                    if (countAddy > addyMax) {
                        addyMax = countAddy;
                    }
                    countAddy = 0;
                }
            }
            if (countAddy > addyMax) {
                addyMax = countAddy;
            }
            if (omMax > addyMax) {
                System.out.println("Om");
            } else if (addyMax > omMax) {
                System.out.println("Addy");
            } else {
                System.out.println("Draw");
            }
            T--;
        }
    }
}
