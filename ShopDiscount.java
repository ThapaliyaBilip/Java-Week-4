import java.util.Scanner;
public class ShopDiscount
{
    
     
    public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter The marked price:");
    float mp=input.nextFloat();
     System.out.println("which catagory does the product fall under ");
        String result = input.nextLine(); 
    float value;
    switch (result) {
        case "A":
            value = 0.6f; 
            break;
        case "B":
            value = 0.4f;
            break;
        case "C":
            value = 0.2f;
            break; 
        case "D":
            value =0.1f;
        default:
            value = 0f;
            break;
    
    }
   
    float sp=mp-(mp * value);
    System.out.println("SP is"+sp);
}   
}
    
    

    