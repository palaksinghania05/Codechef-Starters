package y2024.february.starter120;

import java.util.Scanner;

public class ValentinesContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 121) {
            System.out.println("Likely");
        } else {
            System.out.println("Unlikely");
        }
    }
}
