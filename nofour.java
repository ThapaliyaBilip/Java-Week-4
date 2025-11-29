import java.util.Scanner;

public class nofour
{
        public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number :");
    int Number=input.nextInt();
    if (Number%5 ==0 && Number%3==0)
    {
        System.out.println(" No is divisible by both 5 and 3");
    }
    else
    {
        System.out.println("truly a bad no");
    }
    
}
}