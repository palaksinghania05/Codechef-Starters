package y2024.february.starter123;

import java.util.Scanner;

public class RoomAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int answer = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                answer += (A[i] / 2) + (A[i] % 2);
            }
            System.out.println(answer);
            T--;
        }
    }
}
