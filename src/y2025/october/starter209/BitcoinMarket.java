package y2025.october.starter209;

import java.util.Scanner;

public class BitcoinMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        if (R <= 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
