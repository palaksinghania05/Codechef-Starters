package august.starterC;

import java.util.Scanner;

public class HardestProblemBet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int Sa = sc.nextInt();
                int Sb = sc.nextInt();
                int Sc = sc.nextInt();
                int minimumSubmission = Math.min(Sa,Math.min(Sb,Sc));
                if(minimumSubmission == Sb)
                    System.out.println("Bob");
                else if(minimumSubmission == Sc)
                    System.out.println("Alice");
                else
                    System.out.println("Draw");
                T--;
            }
        }
    }
}
