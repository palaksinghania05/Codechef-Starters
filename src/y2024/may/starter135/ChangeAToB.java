package y2024.may.starter135;

import java.util.Scanner;

public class ChangeAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long K = sc.nextLong();
            long result = 0;
            while (true) {
                if ((B % K == 0) && (B / A >= K)) {
                    result++;
                    B /= K;
                } else if (B % K == 0) {
                    result += (B - A);
                    break;
                } else {
                    long temp = B % K;
                    result += temp;
                    B -= temp;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
