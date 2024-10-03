package y2024.october.starter154;

import java.util.Scanner;

public class ColdplayTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int totalPeople = N + 1;
        int ticketCost = 5000;
        int totalCost = totalPeople * ticketCost;
        System.out.println(totalCost);
    }
}
