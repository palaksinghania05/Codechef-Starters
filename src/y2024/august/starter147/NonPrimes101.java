package y2024.august.starter147;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NonPrimes101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            if (!isPrime(i)) {
                list.add(i);
            }
        }
        int size = list.size();
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                map.put(A[i], i + 1);
            }
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < size; j++) {
                    if (map.containsKey(list.get(j) - A[i])) {
                        if (map.get(list.get(j) - A[i]) != i + 1) {
                            flag = true;
                            System.out.println((i + 1) + " " + map.get(list.get(j) - A[i]));
                            break;
                        }
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
            T--;
        }
    }

    public static boolean isPrime(int ele) {
        if (ele == 2 || ele == 3) {
            return true;
        }
        if (ele % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(ele); i++) {
            if (ele % i == 0) {
                return false;
            }
        }
        return true;
    }
}
