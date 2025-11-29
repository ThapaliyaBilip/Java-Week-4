import java.util.Scanner;

public class GPATOGRADECOVERTER
{
    
    public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number :");
    float Number=input.nextFloat();
       if (Number>4 && Number<0)
    {
         System.out.println("Invalid input");
       
    }
    else if (Number<=4 && Number>3.6)
    {
     System.out.println("U got A+");
        
    }
 else if (Number<=3.6 && Number>3.2)
        {
System.out.println("U got A");
        }   
 else if (Number<=3.2 && Number>2.8)
 {
System.out.println("U got B+");   }
 
else if (Number<=2.8 && Number>2.4)
    {System.out.println("U got B");    }
 else if (Number<=2.4 && Number>2)
     {
         System.out.println("U got C+");
        }
else if (Number<=2 && Number>1.6)
     {
         System.out.println("U got c");
        }
else 
{
    System.out.println("U Failed,NG");
}
 
 
    
}
}