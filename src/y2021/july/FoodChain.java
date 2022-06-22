package y2021.july;

import java.util.Scanner;

public class FoodChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int E = sc.nextInt();
                int K = sc.nextInt();
                int count = 1;
                while(E!=0){
                    if(Math.floor(E/K)>0) {
                        count++;
                        E=(int)Math.floor(E/K);
                    }
                    else
                        break;
                }
                System.out.println(count);
                T--;
            }
        }
    }
}
