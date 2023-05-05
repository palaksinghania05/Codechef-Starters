package y2023.may.starter88;

import java.util.Scanner;

public class MasterchefFinals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            if (X <= 10)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
