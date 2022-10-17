package study;

class ThrowTest 
{
	public static void main(String[] args) 
	{
		int r = 4/2;
		System.out.println("결과:" + r);

		throw new ArithmeticException();
	}
}
