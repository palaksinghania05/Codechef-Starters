/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-10-2022
 */

package y2022.october.starter59;

import java.util.Scanner;

public class Speciality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int max = Math.max(X,Math.max(Y,Z));
            if(max==X)
                System.out.println("Setter");
            else if(max==Y)
                System.out.println("Tester");
            else
                System.out.println("Editorialist");
            T--;
        }
    }
}
