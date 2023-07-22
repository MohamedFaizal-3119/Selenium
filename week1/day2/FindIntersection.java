package week1.day2;

public class FindIntersection {
	
	public static void main (String [] args)
	{
		
		int a []= {4,3,12,17,19,7};	 
		 int b []=  {19,22,7,28,3,31};
		 intersection(a,b);
	}
	
	
	static void intersection (int a [], int b[])
	{
		for (  int i =0;i<a.length;i++)
		{
			for( int j=0;j<b.length;j++)
			{
				if (a[i]==b[j])
				{
					
				System.out.print(a[i]+",");
				}
			}
		}
	}
}
