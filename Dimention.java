import java.util.Scanner;

public class Dimention
{
        
    public static void main(String[] argus)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter The marked price:");
    float mp=input.nextFloat();
     System.out.println("which catagory does the product fall under ");
        String result = input.nextLine(); 
    double value;
    switch (result) {
        case "A":
            System.out.println("841 x 1189 mm (33.1 x 46.8 inches)"); 
            break;
        case "B":
            System.out.println("594 x 841 mm (23.4 x 33.1 inches)") ;
            break;
        case "C":
            System.out.println("420 x 841 mm (23.4 x 33.1 inches)");
            break; 
        case "D":
            System.out.println(" 297 x 420 mm (11.7 x 16.5 inches)");
        case "E":
            System.out.println("210 x 297 mm (8.3 x 11.7 inches)") ;
        case "F":
            System.out.println( "48 x 210 mm (5.8 x 8.3 inches)");
        default:
            System.out.println("Wrong data type");
            break;
            
            
    
}

}}