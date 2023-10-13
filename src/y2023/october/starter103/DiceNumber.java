package y2023.october.starter103;

import java.util.Arrays;
import java.util.Scanner;

public class DiceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] arr1 = new int[3];
            int[] arr2 = new int[3];
            for (int i = 0; i < 3; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                arr2[i] = sc.nextInt();
            }
            StringBuilder str1 = new StringBuilder();
            Arrays.sort(arr1);
            for (int i = 2; i >= 0; i--) {
                str1.append(arr1[i]);
            }
            StringBuilder str2 = new StringBuilder();
            Arrays.sort(arr2);
            for (int i = 2; i >= 0; i--) {
                str2.append(arr2[i]);
            }
            if (str1.toString().compareTo(str2.toString()) > 0) {
                System.out.println("Alice");
            } else if (str1.toString().contentEquals(str2)) {
                System.out.println("Tie");
            } else {
                System.out.println("Bob");
            }
            T--;
        }
    }
}
