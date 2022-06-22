package y2021.october.starterA;

import java.util.Scanner;

public class GoldMining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int X = sc.nextInt();
                int Y = sc.nextInt();
                if((N+1)*Y >= X)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }
    }
}
