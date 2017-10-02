//Nicholas Huynh Period 2 Lab 1.1
public class ControlStructure 
{
	public static void main(String [] args)
	{
		fooBarBaz();
		primePrinter();
	}

	public static void fooBarBaz() {
		for(int x = 1; x <= 500;x++)
		{
			
			if (x % 10 == 0 && x % 7 == 0 && x % 3 == 0)
				System.out.println("FooBarBaz");
			else if (x % 10 == 0 && x % 7 == 0)
				System.out.println("BarBaz");
			else if (x % 10 == 0 && x % 3== 0)
				System.out.println("FooBaz");
			else if (x % 7 == 0 && x % 3 == 0)
				System.out.println("FooBar");
			else if (x % 10 == 0)
				System.out.println("Baz");
			else if (x % 7 == 0)
				System.out.println("Bar");
			else if (x % 3 == 0)
				System.out.println("Foo");
			else 
				System.out.println(x);
		}
		}
	
	public static void primePrinter()
	{
		{
			int count = 0;
			int num = 1;
			int a;

				while(count < 50)
				{
					num++;
					for( a = 2 ; a <= num - 1 ; a++)
					{
						if( num % a == 0) 
						break;
						
					}
				if( a >= num - 1)
				{
					System.out.println(num);
					count++;
				}
			}
		}
	}
}
		
			