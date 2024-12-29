package y2024.december.starter166;

import java.util.PriorityQueue;
import java.util.Scanner;

public class CostlyPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                arr[i] = sc.nextInt();
            }
            boolean[] flag = new boolean[N + 1];
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int i = 1; i <= N; i++) {
                if (!flag[i]) {
                    int length = 0;
                    int temp = i;
                    while (!flag[temp]) {
                        flag[temp] = true;
                        temp = arr[temp];
                        length++;
                    }
                    queue.add(length);
                }
            }
            int result = 0;
            while (queue.size() > 1) {
                int first = queue.remove();
                int second = queue.remove();
                int mergeCost = first + second;
                result += mergeCost;
                queue.add(mergeCost);
            }
            System.out.println(result);
            T--;
        }
    }
}
