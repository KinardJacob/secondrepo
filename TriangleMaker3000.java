//Jacob Kinard
package triangleMaker;
import java.util.Scanner;
public class TriangleMaker3000 {
	public static void main(String[] args) 
	{
		System.out.println("Hello! Please enter how big your triangle needs to be!");
		int builder = 1;
		Scanner keyboard = new Scanner(System.in);
		int size = keyboard.nextInt();
		String star = "*";
		String loopstar = star.repeat(builder);
			if(size < 1)
				{
				System.out.println("Invalid input!");
				}else
				{
					while(builder < size) 
						{
						loopstar = star.repeat(builder);	
						System.out.println(loopstar);
							builder++;
						}
			
					while(builder >= 1) 
						{
						loopstar = star.repeat(builder);	
						System.out.println(loopstar);
							builder--;
						}
						System.out.println("Here is your triangle that is " + size + " *'s in size!");
				}
	}

}
