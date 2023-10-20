package y2023.october.starter104;

import java.util.Scanner;

public class SantaAndChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int totalVal = 0;
            for (int i = 0; i < N; i++) {
                int val = sc.nextInt();
                totalVal += val;
            }
            int quotient = totalVal / N;
            int remainder = totalVal % N;
            String myRes = "NO";
            int maxDis = (remainder != 0) ? quotient + 1 : quotient;
            if ((quotient != 0) && (((maxDis) - (quotient)) <= K)) {
                myRes = "YES";
            }
            System.out.println(myRes);
            T--;
        }
    }
}
