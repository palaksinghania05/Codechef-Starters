package y2023.september.starter100;

import java.util.Scanner;

public class AirQualityIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X < 100)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
