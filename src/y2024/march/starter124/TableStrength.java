package y2024.march.starter124;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TableStrength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0) {
            int N = scanner.nextInt();
            ArrayList<Long> W = new ArrayList<>();
            for (int i = 0; i < N; i++)
                W.add(scanner.nextLong());
            Collections.sort(W);
            long result = W.get(N - 1);
            long temp = 1;
            for (int i = N - 1; i >= 0; i--) {
                long total = temp * W.get(i);
                result = Math.max(total, result);
                temp++;
            }
            System.out.println(result);
            T--;
        }
    }
}
