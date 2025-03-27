package y2025.march.starter179;

import java.util.Scanner;

public class ConquerTheFest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        if (N >= B * 10)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
