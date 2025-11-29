import java.util.Scanner;

public class OddorEven 
{
    public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number :");
    int Number=input.nextInt();
    if(Number%2==0)
    {System.out.println("The no is Even");}
    else if (Number==0)
    {System.out.println("The no is zero");}
    else
    {System.out.println("The no is odd");}
    }
}