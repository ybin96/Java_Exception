package study;

import java.io.FileWriter;
import java.io.IOException;
class NotRunTimeExceptionTest 
{
	public static void main(String[] args) 
	{
		try{
			FileWriter fw = new FileWriter("hello.txt");
			fw.write("hello java");
			fw.close();
			System.out.println("파일을 생성하였습니다.");
		}catch(IOException e ){
			System.out.println("예외발생");
		}
	}
}
