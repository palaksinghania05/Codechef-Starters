package y2024.december.starter164;

import java.util.Scanner;

public class ItzSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt(), K = sc.nextInt(), P = sc.nextInt();
            int[] arr = new int[N];
            int max = Integer.MIN_VALUE, sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
                sum += arr[i];
            }
            int temp = P + (sum - max), temp1 = K + max;
            if (temp1 > temp)
                System.out.println("Ved");
            else if (temp1 < temp)
                System.out.println("Varun");
            else
                System.out.println("Equal");
            T--;
        }
    }
}
