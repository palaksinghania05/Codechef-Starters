package y2025.february.starter173;

import java.util.Scanner;

public class Overwrite {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                B[i] = sc.nextInt();
            }
            int temp = -1;
            int min = (int) 1e9;
            for (int i = 0; i < M; i++) {
                if (min > B[i]) {
                    min = B[i];
                    temp = i;
                }
            }
            int i = 0;
            while (i < N) {
                if (M == 1) {
                    if (A[i] <= min) {
                        result.append(A[i]).append(" ");
                    } else {
                        result.append(min).append(" ");
                    }
                    i++;
                } else if ((N - i) == M && A[i] == min) {
                    result.append(A[i]).append(" ");
                    boolean flag = false;
                    if ((N - i) == M && A[i] == min) {
                        i++;
                        int j = temp + 1;
                        j %= M;
                        int temp2 = i;
                        for (int k = 1; k < M; k++) {
                            if (A[temp2] == B[j]) {
                                temp2++;
                                j++;
                                j %= M;
                            } else if (A[temp2] < B[j]) {
                                break;
                            } else {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            j = temp + 1;
                            j %= M;
                            for (int k = 1; k < M; k++) {
                                result.append(B[j]).append(" ");
                                j++;
                                j %= M;
                                i++;
                            }
                        }
                    } else
                        i++;
                } else if (A[i] <= min || (N - i) < M) {
                    result.append(A[i]).append(" ");
                    i++;
                } else {
                    while (i <= (N - M)) {
                        result.append(min).append(" ");
                        i++;
                    }
                    int j = temp + 1;
                    j %= M;
                    while (i < N) {
                        result.append(B[j]).append(" ");
                        j++;
                        j %= M;
                        i++;
                    }
                }
            }
            result.append("\n");
            T--;
        }
        System.out.println(result);
    }
}
