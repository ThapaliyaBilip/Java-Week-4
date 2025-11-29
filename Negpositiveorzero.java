import java.util.Scanner;

public class Negpositiveorzero 
{
   
   public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number :");
    int Number=input.nextInt();
    if(Number>0)
    {System.out.println("The Number is positive");}
    else if (Number==0)
    {System.out.println("The Number is zero");}
    else
    {System.out.println("The Number is negative");}
    }
}
