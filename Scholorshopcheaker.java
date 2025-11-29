 import java.util.Scanner;
public class Scholorshopcheaker
{
    public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Input GPA");
    float Gpa=input.nextFloat();

    System.out.println("attendance %(1-100):");
    float Number=input.nextFloat();

    System.out.println("attitude score(1-10): ");
    int alt=input.nextInt();
    
    
    if(Gpa>3.2)
    {
        if(Number>80)
   {
    if(alt>5)
    {
     System.out.println("U  qualify");
    }
    
    else
    {System.out.println("U dont qualify");}
    }   
    else
    {  
    System.out.println("U dont qualify");
    }
}
    else
   {
    System.out.println("U dont qualify");
     }
        
    
   } 
}