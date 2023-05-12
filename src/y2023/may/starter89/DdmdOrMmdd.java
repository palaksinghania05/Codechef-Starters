package y2023.may.starter89;

import java.util.Scanner;

public class DdmdOrMmdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String[] s = sc.next().split("/");
            int first = Integer.parseInt(s[0]);
            int second = Integer.parseInt(s[1]);
            if (first > 12)
                System.out.println("DD/MM/YYYY");
            else if (second > 12)
                System.out.println("MM/DD/YYYY");
            else
                System.out.println("Both");
            T--;
        }
    }
}
