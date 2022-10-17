package study;

class FinallyTest
{
	public static void main(String[] args) 
	{
		try{
			 int a = Integer.parseInt(args[0]);
			 int b = Integer.parseInt(args[1]);
			 int div = a/b;
			 System.out.println("나누기 결과:" + div);
			 System.out.println("작업완료");		// <-- 예외가 발생되면 동작하지 않아요
		}catch(ArithmeticException e){
			System.out.println("0으로 나누기 할 수는 없어요");
		}catch(Exception e){
			System.out.println("나누기할 두 수를 확인하세요!");
		}	

	}
}
