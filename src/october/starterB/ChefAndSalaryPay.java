package october.starterB;

import java.util.Scanner;

public class ChefAndSalaryPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int X = sc.nextInt();
                int Y = sc.nextInt();
                String str = sc.next();
                int count = 0, streak = 0, salary = 0;
                for (int i = 0; i < 30; i++) {
                    if(str.charAt(i) == '1'){
                        salary = salary + X;
                        count++;
                    }
                    else{
                        streak = Math.max(count, streak);
                        count = 0;
                    }
                }
                streak = Math.max(count, streak);
                salary = salary + streak*Y;
                System.out.println(salary);
                T--;
            }
        }
    }
}
