package y2025.february.starter175;

import java.util.Scanner;

public class AssignmentDue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X <= Y)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
