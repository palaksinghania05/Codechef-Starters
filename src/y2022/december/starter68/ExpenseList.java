/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-12-2022
 */

package y2022.december.starter68;

import java.util.Scanner;

public class ExpenseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int totalSalary = (int) Math.pow(2, X);
            for (int i = 0; i < N; i++) {
                int expense = totalSalary / 2;
                totalSalary = totalSalary - expense;
            }
            System.out.println(totalSalary);
            T--;
        }
    }
}
