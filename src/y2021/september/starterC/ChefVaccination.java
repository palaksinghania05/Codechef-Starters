package y2021.september.starterC;

import java.util.Scanner;

public class ChefVaccination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int P = sc.nextInt();
                int X = sc.nextInt();
                int Y = sc.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = sc.nextInt();
                }
                int time = 0;
                int position = 1;
                while(position <= P){
                    if(arr[position-1] == 0)
                        time += X;
                    else
                        time += Y;
                    position++;
                }
                System.out.println(time);
                T--;
            }
        }
    }
}
