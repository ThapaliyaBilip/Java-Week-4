import java.util.Scanner;

public class tax {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        double taxRate;
        if (income < 500000) {
            taxRate = 0.01;
            System.out.println("The tax you have to pay according to your income is: " + (taxRate * income));
        } else if (income <= 700000) {
            taxRate = 0.10;
            System.out.println("The tax you have to pay according to your income is: " + (taxRate * (income-500000) + 5000));
        } else if (income <= 1000000) {
            taxRate = 0.20;
            System.out.println("The tax you have to pay according to your income is: " + (taxRate * (income-700000) + 15000));
        } else if (income <= 2000000) {
            taxRate = 0.30;
            System.out.println("The tax you have to pay according to your income is: " + (taxRate * (income-1000000) + 35000));
        } else if (income <= 5000000) {
            taxRate = 0.36;
            System.out.println("The tax you have to pay according to your income is: " + (taxRate * (income-2000000) + 335000));
        } else {
            taxRate = 0.39;
            System.out.println("The tax you have to pay according to your income is: " + (taxRate * (income-5000000) + 1135000));
        }
    }
}