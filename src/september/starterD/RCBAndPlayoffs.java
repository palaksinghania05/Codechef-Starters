package september.starterD;

import java.util.Scanner;

public class RCBAndPlayoffs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int X = sc.nextInt();
                int Y = sc.nextInt();
                int Z = sc.nextInt();
                int points = Y-X;
                if(Z*2>=points)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }
    }
}
