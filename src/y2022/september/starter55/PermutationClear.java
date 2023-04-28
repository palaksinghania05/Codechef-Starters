/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-09-2022
 */

package y2022.september.starter55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PermutationClear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                 A[i] = sc.nextInt();
            }
            int K = sc.nextInt();
            ArrayList<Integer> B = new ArrayList<>();
            for (int i = 0; i < K; i++) {
                B.add(sc.nextInt());
            }
            for (int i = 0; i < N; i++) {
                if(B.contains(A[i]))
                    continue;
                else
                    System.out.print(A[i] + " ");
            }
            System.out.println();
            T--;
        }
    }
}
