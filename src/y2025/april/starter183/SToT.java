package y2025.april.starter183;

import java.util.ArrayList;
import java.util.Scanner;

public class SToT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            char[] S = sc.next().toCharArray();
            char[] R = sc.next().toCharArray();
            boolean flag = true;
            ArrayList<Integer> list = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S[i] == '0') {
                    if (count > 0) {
                        S[i] = '1';
                        list.add(i);
                    }
                }
                if (S[i] == '1')
                    count++;
            }
            for (int i = N - 1; i >= 0; i--) {
                if (S[i] == '1') count--;
                if (S[i] != R[i]) {
                    if (i == 0 || count == 0) {
                        flag = false;
                        break;
                    } else {
                        list.add(i);
                    }
                }
            }
            if (flag) {
                System.out.println(list.size());
                for (int i : list) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
