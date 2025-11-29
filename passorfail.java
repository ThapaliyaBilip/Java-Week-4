import java.util.Scanner;

public class passorfail 
{
    public static void main(String[] argus)
    {
     
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your marks :");
    int Marks=input.nextInt();
    if (Marks>= 40)
    {
        System.out.println("You have passed");
    }
    else
    {
        System.out.println("Better luck next year man you have failed");
    }
    }
}