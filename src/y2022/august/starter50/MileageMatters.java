/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-08-2022
 */

package y2022.august.starter50;

import java.util.Scanner;

public class MileageMatters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            double N = sc.nextDouble();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            double litresA = N/A;
            double litresB = N/B;
            if(litresA*X < litresB*Y)
                System.out.println("PETROL");
            else if(litresA*X > litresB*Y)
                System.out.println("DIESEL");
            else
                System.out.println("ANY");
            T--;
        }
    }
}
