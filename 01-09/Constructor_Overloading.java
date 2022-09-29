class Parent 
{
	Parent()
	{
		System.out.println("Parent Class Constructor ...");
	}
}
 class Constructor_Overloading extends Parent
{
	Constructor_Overloading(int x)
	{
		int area = x ;
		System.out.println(area);
	}
	
	public static void main(String[] args) 
	{
		Constructor_Overloading obj = new Constructor_Overloading(20);
	}
}