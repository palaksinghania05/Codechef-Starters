package y2021.september.starterB;

import java.util.Scanner;

public class GoodWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int[] arr = new int[7];
                int rainy = 0, sunny = 0;
                for (int i = 0; i < 7; i++) {
                    arr[i] = sc.nextInt();
                    if(arr[i]==0)
                        rainy++;
                    else
                        sunny++;
                }
                if(rainy>sunny){
                    System.out.println("NO");
                }
                else
                    System.out.println("YES");
                T--;
            }
        }
    }
}
