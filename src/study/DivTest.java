package study;

// javac DivTest.java
// java DivTest 5 2				<--- 프로그램 실행시에 실행에 필요한 값을 전달 해 줄 수 있어요!
// java Hello tiger
// java SumTest 1 2 3 4 5 6 7
// java Test 1.5 6.7

// 프로그램 실행시에 두개의 정수를 전달받아 나누기한 결과를 출력
class DivTest 
{
	public static void main(String[] args) // <--- 프로그램 실행시 전달한 값이 main메소드의 매개변수로 전달됨
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int div = a/b;
		System.out.println("나누기결과:" + div);
	}
}
