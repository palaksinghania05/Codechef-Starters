package y2024.july.starter144;

import java.util.Scanner;

public class CapitalGainTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X < Y)
            System.out.println("Increased");
        else if (X > Y)
            System.out.println("decreased");
        else
            System.out.println("Same");
    }
}
