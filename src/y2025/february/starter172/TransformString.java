package y2025.february.starter172;

import java.util.Scanner;

public class TransformString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String A = sc.next();
            String B = sc.next();
            int[] arr = new int[B.length()];
            int temp1 = B.length() - 1, temp2 = A.length() - 1;
            while (temp1 >= 0 && temp2 >= 0) {
                if (A.charAt(temp2) == B.charAt(temp1)) {
                    arr[temp1] = temp2;
                    temp1--;
                }
                temp2--;
            }
            if (temp1 != -1) {
                System.out.println("-1");
                continue;
            }
            long result = 0;
            int temp3 = 0;
            int temp4 = 1;
            for (int index : arr) {
                int len = index - temp3;
                result += (long) temp4 * len;
                temp3 = index + 1;
                temp4++;
            }
            if (temp3 != A.length()) {
                int len = (B.length() + 1) * (A.length() - temp3);
                result += len;
            }
            System.out.println(result);
        }
    }
}
