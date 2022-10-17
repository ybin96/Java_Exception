package study;
class ExceptionTest02 
{
	public static void calcDiv(int a, int b)  throws ArithmeticException   {
		int div = a/b;				
		System.out.println("나누기 결과:" + div);
	}

	public static void main(String[] args) 
	{
		try{
			calcDiv(4,2);
			calcDiv(4,0);
		}catch(ArithmeticException e){
			System.out.println("0으로 나누기할 수 없어요!");
		}
	}
}

// 메소드안에서 예외가 발생됩니다.
//		메소드안에서 직접 try~catch로 처리 할 수 있어요
//		메소드 호출하는 쪽은 예외처리를 맡길 수 있어요			<---

