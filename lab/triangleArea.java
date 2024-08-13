class triangleArea
{
	public static void main(String args[])
	{
        double area;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
		if (a==b && b==c)
        {
            area = Math.sqrt(3)/4 * a * a;
            System.out.println("Area of equilateral triangle :"+area);
        }
        else if (a==b || b==c)
        {
            area = 0.5 * (Math.sqrt(a*a - (b*b)/4)) * b;
            System.out.println("Area of isosceles triangle :"+area);
        }
        else
        {
            double s = (a+b+c)/2;
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of scalene triangle :"+area);
        }
	}
}
