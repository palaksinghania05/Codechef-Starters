package y2024.may.starter136;

import java.util.Scanner;

public class WhoMakesP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A <= B) {
            System.out.println("Tyro");
        } else {
            System.out.println("Dom");
        }
    }
}
