package ExceptionHandeling;
import java.util.*;

public class ExpHndl {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		try 
		{
		int age;
		 float height;
         System.out.println("Enter Your Age : ");
          age = sc.nextInt();
         System.out.println("Ente Your Height : ");
          height = sc.nextFloat();
          
          float BMI = age/height;
          System.out.println("Your BMI is : "+BMI);
		}
		catch(ArithmeticException e)
		{
			System.out.println("plz do not enter zero value ...");
		}catch(InputMismatchException e)
		{
			System.out.println("plz enteer only number ...");
		}
	}

}
