import java.util.Scanner;

public class divbythreeor5
{
    public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number :");
    int Number=input.nextInt();
    if (Number%5 ==0)
    {
        if(Number%3==0)
        {
            System.out.println("The number is divisible by 3 and 5");
        }
        else
        {
            System.out.println("The no is divisible by 5 but not 3");
        }
    }
    else if (Number%3==0)
    {
        if (Number%5==0)
        {
            System.out.println("The no is  divisible by both 3 and 5");
        }
        else 
        {
            System.out.println("The no is  divisible by 3 but not 5");
        }
        
    }
    else
        {
            System.out.println ("The System is not divisible by both 3 and 5");
        }
    }
}