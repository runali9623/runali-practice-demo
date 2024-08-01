class Addition
{
	public static void sum(float number1, float number2)//sum method written  
	{
		System.out.println("sum method started!!!");
		float result = 1;
		result = number1 + number2;
		System.out.println(result);
		System.out.println("sum method ended!!!");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method started!!!");
		sum(40, 30);//method calling
		System.out.println("Main method ended!!!");
	}
	

}