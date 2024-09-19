package y2024.september.starter152;

import java.util.Scanner;

public class ChessOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double won = sc.nextDouble();
        double draw = sc.nextDouble();
        double loss = sc.nextDouble();
        double totalGames = won + draw + loss;
        double remaining = 4 - totalGames;
        double temp1 = won + (draw * 0.5);
        double temp2 = loss + (draw * 0.5);
        if (totalGames < 4) {
            if ((remaining + temp1) > temp2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (temp1 > temp2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
