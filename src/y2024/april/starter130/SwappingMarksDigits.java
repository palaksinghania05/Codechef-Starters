package y2024.april.starter130;


import java.util.Scanner;

public class SwappingMarksDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int rev1 = ((A % 10) * 10) + (A / 10);
            int rev2 = ((B % 10) * 10) + (B / 10);
            if (A > B || A > rev2 || rev1 > B || rev1 > rev2)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
