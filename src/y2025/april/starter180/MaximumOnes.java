package y2025.april.starter180;

import java.util.Scanner;

public class MaximumOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            char[] arr = Integer.toString(sc.nextInt()).toCharArray();
            int length = arr.length;
            int temp = 0, result = 0;
            for (int i = length - 1; i >= 0; i--) {
                if (arr[i] == '1') {
                    temp = 1;
                    result++;
                } else {
                    if (temp == 1 && K > 0) {
                        K--;
                        result++;
                    }
                }
            }
            if (length < N && temp == 1) {
                result += Math.min(K, N - length);
            }
            System.out.println(result);
        }
    }
}
