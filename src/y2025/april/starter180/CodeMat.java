package y2025.april.starter180;

import java.util.Scanner;

public class CodeMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (Y > X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
