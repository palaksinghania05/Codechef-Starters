package y2024.september.starter150;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMultisetState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            while (K > 0) {
                int temp1 = arr.get(0);
                int temp2 = arr.get(arr.size() - 1);
                arr.remove(0);
                arr.remove(arr.size() - 1);
                arr.add(temp1 + temp2);
                K--;
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            T--;
        }
    }
}
