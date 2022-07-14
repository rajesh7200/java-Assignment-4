class Area_method_arguments
{
    static void circle_area(int redius)
    {
		
	  double area=3.14*redius*redius;
      System.out.println("The area of Circle is "+area);
	}


static void ellipse_area(int minar_axis,int major_axis)
    {
         
	    double area=3.14*minar_axis*major_axis;
		System.out.println("The area of ellipse is "+area);
	}



 static void parallelogram_area(int base,int height)
    {
        
        int area=base*height;
		System.out.println("The area of Parallelogram is "+area);

	}


    static void rectangle_Area(int width,int height )
    {
      
        double area=width*height;
		System.out.println("The area of Rectangle is "+area);
   
	}



    static void sector_area(double redius,double angle)
    {
       
		double area=0.5*redius*redius*(angle/360);
		System.out.println("The area of Sector is "+area);

   
	}



    static void trapezoid_area(int side_a,int side_b,int height)
    {
        
        double area=0.5*(side_a+side_b)*height;
	    System.out.println("The area of Trapezoid is "+area);

   
	}



    static void triangle_area(int base,int height)
    {
       
	    double area;
        area=0.5*base*height;
		System.out.println("The area of Triangle is "+area);
   
	}


    static void squre_area(int side)
    {
     
    	int area=side*side;
		System.out.println("The area of Squre is "+area);

   
	}



	public static void main(String [] args)
	{
	    circle_area(2);
        ellipse_area(5,10);
        parallelogram_area(5,10);
        rectangle_Area(5,10);
        sector_area(6.5,30.0);
        trapezoid_area(5,6,8);
        triangle_area(5,10);
        squre_area(5);

	}

};
