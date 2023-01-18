/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-01-2023
 */

package y2023.january.starter74;

import java.util.Scanner;

public class Facebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int[] result = new int[N];
            for (int i = 0; i < N; i++) {
                result[i] = A[i] + B[i];
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                if (A[max] < A[i])
                    max = i;
                if (A[max] == A[i]) {
                    if (result[max] < result[i])
                        max = i;
                }
            }
            System.out.println(max + 1);
//            int[] copyA = A.clone();
//            // System.out.println(Arrays.toString(copyA));
//            Arrays.sort(copyA);
//            if (copyA[N - 2] == copyA[N - 1]) {
//                int max = 0;
//                int index = 0;
//                for (int i = 0; i < N; i++) {
//                    if (max < B[i]) {
//                        max = B[i];
//                        index = i;
//                    }
//                }
//                System.out.println(index + 1);
//            } else {
//                for (int i = 0; i < N; i++) {
//                    if (A[i] == copyA[N - 1]) {
//                        System.out.println(i + 1);
//                        break;
//                    }
//                }
//            }

            T--;
        }
    }
}
