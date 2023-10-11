package y2023.october.starter103;

import java.util.Scanner;

public class OctoberMarathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float X = sc.nextFloat();
        if (X < 3) {
            System.out.println("Gold");
        } else if (X >= 3 && X < 6) {
            System.out.println("Silver");
        } else {
            System.out.println("Bronze");
        }
    }
}
