package y2024.december.starter164;

import java.util.Scanner;

public class NewProCoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        int M = sc.nextInt();
        double temp = N / 2;
        if (M >= temp) {
            System.out.println("newbie");
        } else {
            System.out.println("pro");
        }
    }
}
