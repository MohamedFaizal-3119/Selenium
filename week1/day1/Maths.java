package week1.day1;

public class Maths {
	
	
	public int add (int a,int b)
	{
		return a+b;
	}
	
	
	public int mul(int a,int b) 
	{
		return a*b;
	}
	
	
	public int div(int a,int b)
	{
		return a/b;
	}
	
	
	
	public static void main(String[] args) {
		//To call the method
		Maths ms=new Maths();
		ms.add(3, 4);
		System.out.println("Sum is" +ms.add(12,16));
		System.out.println("Multiply is" +ms.mul(5,4));
		System.out.println("Div is" +ms.div(50, 10));
			
		
	}
}