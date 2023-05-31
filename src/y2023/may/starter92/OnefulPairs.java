package y2023.may.starter92;

import java.util.Scanner;

public class OnefulPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a + b + (a * b) == 111)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
