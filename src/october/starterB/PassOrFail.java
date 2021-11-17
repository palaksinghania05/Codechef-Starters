package october.starterB;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int X = sc.nextInt();
                int P = sc.nextInt();
                int marks = X*3 + (N-X)*(-1);
                if(marks>=P)
                    System.out.println("PASS");
                else
                    System.out.println("FAIL");
                T--;
            }
        }
    }
}
