package may;

import java.util.Scanner;

public class LazyChef {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            while(t-->0){
                int x = sc.nextInt();
                int m = sc.nextInt();
                int d = sc.nextInt();
                System.out.println(Math.min(x*m,x+d));
            }
        }
    }
}
