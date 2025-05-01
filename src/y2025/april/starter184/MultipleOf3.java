package y2025.april.starter184;

import java.util.Scanner;

public class MultipleOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 3 == 1)
            System.out.print(N - 1);
        else if (N % 3 == 2)
            System.out.print(N + 1);
        else
            System.out.print(N);
    }
}
