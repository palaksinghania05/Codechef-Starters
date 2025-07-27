package y2025.july.starter196;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ApendAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            long[] arr = new long[N];
            long result = 0;
            Queue<Long> queue = new PriorityQueue<>();
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
                result += arr[i];
                queue.offer(arr[i]);
            }
            while (K > 0) {
                long first = queue.poll();
                long second = queue.poll();
                long temp = (first + second + 1) / 2;
                if (temp >= second) {
                    result += (temp * K);
                    break;
                }
                result += temp;
                K--;
                queue.offer(first);
                queue.offer(second);
                queue.offer(temp);
            }
            System.out.println(result);
        }
    }
}
