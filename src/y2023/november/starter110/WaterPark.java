package y2023.november.starter110;

import java.util.Scanner;

public class WaterPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weightLimit = sc.nextInt();
        int heightRequirement = sc.nextInt();
        int chefWeight = 60;
        int chefHeight = 130;
        if (chefWeight <= weightLimit && chefHeight >= heightRequirement) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
