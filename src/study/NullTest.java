package study;

class NullTest 
{
	public static void main(String[] args) 
	{
		//String data = "hello";
		String data = null;
		System.out.println(data.charAt(0));
	}
}

/*
C:\javaStudy\day0826>java NullTest
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "<local1>" is null
        at NullTest.main(NullTest.java:7)

*/
