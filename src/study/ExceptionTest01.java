package study;

class ExceptionTest01 
{
	public static void calcDiv(int a, int b){
		int div = a/b;				// <---- 
		System.out.println("나누기 결과:" + div);
	}

	public static void main(String[] args) 
	{
		calcDiv(4,2);
		calcDiv(4,0);
	}
}

// 메소드안에서 예외가 발생됩니다.
//		메소드안에서 직접 try~catch로 처리 할 수 있어요
//		메소드 호출하는 쪽은 예외처리를 맡길 수 있어요

/*
C:\javaStudy\day0826>java ExceptionTest01
나누기 결과:2
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionTest01.calcDiv(ExceptionTest01.java:4)
        at ExceptionTest01.main(ExceptionTest01.java:11)
*/
