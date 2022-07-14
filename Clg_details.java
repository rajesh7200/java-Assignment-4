class Clg_details
{
	static void clg_det(String a,int b,char c,double d,boolean e)
	{
	System.out.println("Collage name is : "+a);	
	System.out.println("Collage code is : "+b);
	System.out.println("Collage grade is : "+c);
	System.out.println("Collage fees is : "+d);
	System.out.println("All details are : "+e);
	}
	
	public static void main(String[] args)
	{
		clg_det("Seacom",123,'A',50000.0,true);
	}
}