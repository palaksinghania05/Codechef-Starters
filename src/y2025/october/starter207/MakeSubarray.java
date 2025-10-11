package y2025.october.starter207;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            List<Integer> blackIndices = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    blackIndices.add(i);
                }
            }
            int result = 0;
            for (int i = 0; i < blackIndices.size() - 1; i++) {
                result += (blackIndices.get(i + 1) - blackIndices.get(i) - 1);
            }
            System.out.println(result);
        }
    }
}
