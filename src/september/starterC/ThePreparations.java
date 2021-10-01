package september.starterC;

import java.util.Scanner;

public class ThePreparations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int M = sc.nextInt();
                int N = sc.nextInt();
                int K = sc.nextInt();
                if((N*K)<M)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }
    }
}
