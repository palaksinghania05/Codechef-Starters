package september.starterB;

import java.util.Collections;
import java.util.Scanner;

public class MakeItDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                if(N==1)
                    System.out.println(3);
                else if(N==2)
                    System.out.println(33);
                else {
                    System.out.println("3" + String.join("", Collections.nCopies(N-2, "0")) + "3");
                }
                T--;
            }
        }
    }
}
