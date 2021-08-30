package august.starterA;

import java.util.Scanner;

public class PenaltyShots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int[] arr = new int[10];
                for (int i = 0; i < 10; i++) {
                    arr[i] = sc.nextInt();
                }
                int teamA = 0;
                int teamB = 0;
                for (int i = 0; i < 10; i=i+2) {
                    if (arr[i] == 1)
                        teamA++;
                }
                for (int i = 1; i < 10; i=i+2) {
                    if (arr[i] == 1)
                        teamB++;
                }
                if(teamA>teamB)
                    System.out.println(1);
                else if(teamB > teamA)
                    System.out.println(2);
                else
                    System.out.println(0);
                T--;
            }
        }
    }
}
