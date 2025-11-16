package y2025.november.starter212;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExitDoor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(sc.nextInt());
            }
            int result = 0;
            for (int j = N; j >= 1; j--) {
                int temp = list.indexOf(j);
                int right = list.size() - temp - 1;
                result += Math.min(temp, right);
                list.remove(temp);

            }
            System.out.println(result);
        }
        sc.close();
    }
}
