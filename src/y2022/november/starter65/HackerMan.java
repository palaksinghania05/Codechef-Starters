/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-11-2022
 */

package y2022.november.starter65;

import java.util.Scanner;

public class HackerMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(isPrime(A+B))
                System.out.println("Alice");
            else
                System.out.println("Bob");
            T--;
        }
    }

    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i<=n/2;i++)
        {
            if((n%i)==0)
                return  false;
        }
        return true;
    }
}
