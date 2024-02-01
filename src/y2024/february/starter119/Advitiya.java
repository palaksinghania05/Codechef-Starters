package y2024.february.starter119;

import java.util.Scanner;

public class Advitiya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N >= 16 && N <= 18) {
            System.out.println("ADVITIYA");
        } else {
            System.out.println("WAITING FOR ADVITIYA");
        }
    }
}
