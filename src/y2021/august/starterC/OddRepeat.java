package y2021.august.starterC;

import java.util.Scanner;

public class OddRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int K = sc.nextInt();
                int S = sc.nextInt();
                S = S - (N*N);
                System.out.println(S/(K-1));
                T--;
            }
        }
    }
}
