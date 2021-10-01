package september.starterA;

import java.util.Scanner;

public class TheTwoDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int S = sc.nextInt();
                int difference = 0;
                if(S<=N)
                    difference = S;
                else
                    difference = N - (S-N);
                System.out.println(difference);
                T--;
            }
        }
    }
}
