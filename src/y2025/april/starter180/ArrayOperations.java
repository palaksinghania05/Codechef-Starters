package y2025.april.starter180;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            boolean flag = false;
            int result = 0;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (ele > result) {
                    result = ele;
                    flag = i % 2 == 0;
                } else if ((i % 2 == 0) && (result == ele))
                    flag = true;
            }
            result += (N - 3) / 2;
            if (flag)
                result++;
            System.out.println(result);
        }
    }
}
