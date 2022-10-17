package study;

import java.util.Scanner;
class ValidJumun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("주민번호를 입력하세요(하이픈 포함)==>");
		jumin = sc.next();
		//900101-1234567   ==>13

		int n = 2;
		int total = 0;
		for(int i=0; i<jumin.length()-1; i++)
		{
			if(i != 6){							
				total +=  Integer.parseInt(jumin.charAt(i)+"") * n++;	
				if(n == 10){
					n = 2;
				}
			}
		}
		
		total = total % 11;   // 0 ~ 10
		total = 11-total;	  //11-0==> 11, 11-1==> 10
		//단, 10은 0, 11은 1로 표기한다

		if(total == 10){
			total = 0;
		}

		if(total == 11){
			total = 1;
		}
		
		int check = Integer.parseInt( jumin.charAt(13)+"" );
		if(total == check){
			System.out.println("올바른 주민번호입니다.");
		}else{
			System.out.println("올바른 주민번호가 아닙니다.");
		}

		//Integer.parseInt가 int로 바꿔주는 건데 또 ""를 붙여야 하는 이유가 뭔가요?

	}
}
