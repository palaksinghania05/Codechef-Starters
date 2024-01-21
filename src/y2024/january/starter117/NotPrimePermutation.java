package y2024.january.starter117;

import java.util.ArrayList;
import java.util.Scanner;

public class NotPrimePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int count = 1;
            ArrayList<Integer> a = new ArrayList<>();
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 != 0) {
                    a.add(arr[i]);
                }
            }
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 != 0) {
                    if (a.get(a.size() - 1) == 1 && arr[i] == 1) {
                        if (a.size() == 1) {
                            System.out.println(-1);
                            count = 0;
                            break;
                        } else {
                            arr[i] = a.get(a.size() - 2);
                            a.remove(a.size() - 2);
                        }
                    } else {
                        arr[i] = a.get(a.size() - 1);
                        a.remove(a.size() - 1);
                    }
                }
            }
            if (count == 1) {
                for (int i = 0; i < N; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            T--;
        }
    }
}
