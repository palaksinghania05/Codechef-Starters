package october.starterA;

import java.util.ArrayList;
import java.util.Scanner;

public class SubtaskProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int M = sc.nextInt();
                int K = sc.nextInt();
                ArrayList<Integer> arr = new ArrayList<>();
                int count=0;
                for (int i = 0; i < N; i++) {
                    arr.add(sc.nextInt());
                }
                if(arr.contains(0)){
                    for (int i = 0; i < M; i++) {
                        if(arr.get(i)==1)
                           count++;
                        else
                            break;
                    }
                    if(count==M)
                        System.out.println(K);
                    else
                        System.out.println(0);
                }
                else
                    System.out.println(100);
                T--;
            }
        }
    }
}
