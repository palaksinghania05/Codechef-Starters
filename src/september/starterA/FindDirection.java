package september.starterA;

import java.util.Scanner;

public class FindDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int X = sc.nextInt();
                if(X%4==0)
                    System.out.println("North");
                else if(X%4==1)
                    System.out.println("East");
                else if(X%4==2)
                    System.out.println("South");
                else
                    System.out.println("West");
                T--;
            }
        }
    }
}
