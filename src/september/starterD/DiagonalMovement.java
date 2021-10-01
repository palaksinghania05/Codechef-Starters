package september.starterD;

import java.util.Scanner;

public class DiagonalMovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int sum = x+y;
                if(sum<0)
                    sum = sum * -1;
                if(sum % 2 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }
    }
}
