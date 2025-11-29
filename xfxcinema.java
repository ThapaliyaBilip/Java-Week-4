
import java.util.Scanner;

public class xfxcinema {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------XFX Cinema-----------");
        System.out.println("Hello and welcome to XFX Cinema!");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        int basePrice = 0;
        if (age < 18) {
            basePrice = 150;
            System.out.println("The base price for children is Rs. "+ basePrice);
        } else if (age >= 18 && age < 60) {
            basePrice = 250;
            System.out.println("The base price for adult is Rs. "+ basePrice);
        } else {
            basePrice = 200;
            System.out.println("The base price for senior citizens is Rs. "+ basePrice);
        }
        System.out.print("Enter the language of your movie (Hindi or English): ");
        String language = sc.nextLine();
        int newPrice = 0;
        if (language.equalsIgnoreCase("hindi")) {
            newPrice = basePrice + 50;
            System.out.println("The new price of your movie is Rs. "+ newPrice);
        } else if (language.equalsIgnoreCase("english")) {
            newPrice = basePrice + 100;
            System.out.println("The new price of your movie is Rs. "+ newPrice);
        }
        System.out.println("Let's try for your applicable discounts!");
        System.out.print("Is it a festive day? (yes or no): ");
        String check = sc.nextLine();
        double finalPrice;
        if (check.equalsIgnoreCase("yes")) {
            finalPrice = newPrice - (newPrice * 0.20);
        } else {
            finalPrice = newPrice;
        }
        System.out.println("The final price right now is Rs. "+ finalPrice);
        System.out.print("Are you a student? (yes or no): ");
        String student = sc.nextLine();
        if (student.equalsIgnoreCase("yes")) {
            finalPrice = newPrice - (newPrice * 0.15);
        } else {
            finalPrice = newPrice;
        }
        System.out.println("The discounted price is Rs. "+ finalPrice);
    }
}