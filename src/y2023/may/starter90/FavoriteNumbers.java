package y2023.may.starter90;

import java.util.Scanner;

public class FavoriteNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            if (A % 2 == 0 && A % 7 == 0)
                System.out.println("Alice");
            else if (A % 2 != 0 && A % 9 == 0)
                System.out.println("Bob");
            else
                System.out.println("Charlie");
            T--;
        }
    }
}
