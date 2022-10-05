/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-10-2022
 */

package y2022.october.starter59;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndHappyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            String s = sc.next();
            boolean result = false;
            for (int i = 0; i < s.length()-2; i++) {
                if(isVowel(s.charAt(i))){
                    if(isVowel(s.charAt(i+1)) && isVowel(s.charAt(i+2)))
                        result = true;
                }
            }
            if(result)
                System.out.println("Happy");
            else
                System.out.println("Sad");
            T--;
        }
    }

    public static boolean isVowel(char c){
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        if(!vowels.contains(c))
            return false;
        return true;
    }
}
