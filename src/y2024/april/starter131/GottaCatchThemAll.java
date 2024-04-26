package y2024.april.starter131;

import java.util.Scanner;

public class GottaCatchThemAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr[] = new int[n];
            int count1 = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] * a < b)
                    count1 = count1 + (arr[i] * a);
                else
                    count1 += b;


            }
            System.out.println(count1);

        }
    }
}
