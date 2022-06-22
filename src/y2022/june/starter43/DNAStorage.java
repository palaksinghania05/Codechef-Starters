/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-06-2022
 */

package y2022.june.starter43;

import java.util.Scanner;

public class DNAStorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            String s = sc.next();
            for (int i = 0; i < N; i = i+2) {
                if(s.charAt(i)=='0' && s.charAt(i+1)=='0')
                    System.out.print('A');
                else if(s.charAt(i)=='0' && s.charAt(i+1)=='1')
                    System.out.print('T');
                else if(s.charAt(i)=='1' && s.charAt(i+1)=='0')
                    System.out.print('C');
                else if(s.charAt(i)=='1' && s.charAt(i+1)=='1')
                    System.out.print('G');
            }
            System.out.println();
            T--;
        }
    }
}
