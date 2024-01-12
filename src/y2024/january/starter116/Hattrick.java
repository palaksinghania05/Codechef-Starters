package y2024.january.starter116;

import java.util.Scanner;

public class Hattrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T > 0) {
            String S = sc.nextLine();
            String[] over = S.split(" ");
            boolean flag = false;
            for (int j = 0; j < over.length - 2; j++) {
                if (over[j].equals(over[j + 1]) && over[j].equals(over[j + 2]) && over[j].equals("W")) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("NO");
            T--;
        }
    }
}
