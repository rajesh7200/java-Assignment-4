class Method_with_arguments
{
	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum is : "+c);
	}
	
	static void sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Substraction is : "+c);
	}
	
	static void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Multipication is : "+c);
	}
	
	static void div(int a, int b)
	{
		int c=a/b;
		System.out.println("Division is : "+c);
	}
	
public static void main(String[] args)
{
add(20,30);
sub(30,40);
mul(40,50);
div(50,5);
}
}