package y2024.december.starter166;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CheflandLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                list.add(arr[i]);
            }
            int result = 0;
            HashSet<Integer> hashSetNumbers = new HashSet<Integer>(list);
            for (int i : hashSetNumbers) {
                result += (list.lastIndexOf(i) + 1);
            }
            System.out.println(result);
            T--;
        }
    }
}
