package november.starterA;

import java.util.Scanner;

public class ChefOnVacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int X = sc.nextInt();
                int Y = sc.nextInt();
                int Z = sc.nextInt();
                if(X+Y<=Z)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }
    }
}
