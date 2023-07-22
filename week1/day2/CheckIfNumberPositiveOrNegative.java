package week1.day2;

public class CheckIfNumberPositiveOrNegative
{
	public static void main (String [] args) {
		
		
		 int a =-7;
		
		 
		 if ( check(a)) 
		 
		 {
			System.out.println("given number is positive ")	;
			}
		 
		 
		else
		
		{
			System.out.println("Given number is negative ");
		}
		 
	}
	static boolean check(int a )
	
	{
	if (a>=0)
			
		{
			return true;
		}
	
		else
			return false;
	}

}
