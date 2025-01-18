package y2025.january.starter169;

import java.util.Scanner;

public class HammingEquivalent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                int temp = arr[i];
                if (temp != i + 1) {
                    int second = arr[temp - 1];
                    if (countSetBit(temp) != countSetBit(second)) {
                        flag = false;
                        break;
                    }
                }
            }
            System.out.println(flag ? "Yes" : "No");
            T--;
        }
    }

    private static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
