package august.starterB;

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            System.out.println((N*N)/2);
        }
    }
}
