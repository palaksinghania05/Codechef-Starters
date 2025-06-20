package y2025.june.starter191;

import java.util.Scanner;

public class NearestSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            for (int j = 1; ; j++) {
                if ((j * j) > N) {
                    result = j - 1;
                    System.out.println(result * result);
                    break;
                } else if ((j * j) == N) {
                    System.out.println(j * j);
                    break;
                }
            }
        }
    }
}
