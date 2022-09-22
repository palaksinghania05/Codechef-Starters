/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-09-2022
 */

package y2022.september.starter57;

import java.util.Scanner;

public class AliceAndMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if(X>=2*Y)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
