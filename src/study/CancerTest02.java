package study;

/*
숙제2) 사용자 한테 주민번호를 입력받아 무료암검진 대상자 인지 판별하는 프로그램을 작성합니다.
	무료암검진 대상자는 40세이상이고 올해가 짝수연도 이면 짝수연도에 태어나고 
	홀수연도이면 홀수연도에 태어난 사람입니다.

	< 무료 암검진 항목 >
	40세이상 남자 : 간암, 위암
	40세이상 여자 : 간암, 위암, 유방암, 자궁암
	50세이상 남자 : 간암, 위암, 대장암
	50세이상 여자 : 간암, 위암, 대장암, 유방암, 자궁암

*/
import java.util.Scanner;
import java.util.Date;
class CancerTest02 {
	
	public static boolean isValidJumin(String jumin){
		boolean flag = false;
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
			flag = true;
		}
		return flag;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("주민번호를 입력하세요(하이픈포함)==>");
		jumin = sc.next();
		//900101-1234567		90 + 1900
		//050921-3456789		05 + 2000
		
		if(!isValidJumin(jumin)){
			System.out.println("올바른 주민번호가 아닙니다.");
			return;
		}

		int gender = Integer.parseInt( jumin.charAt(7)+"" );
		int year ;
		if(gender == 1 || gender == 2){
			year = Integer.parseInt( jumin.substring(0,2) ) + 1900;
		}else{
			year = Integer.parseInt( jumin.substring(0,2) ) + 2000;
		}
		
		Date today = new Date();
		int thisYear = today.getYear() + 1900;
		int age = thisYear - year;

		System.out.println("출생년도 :" + year);

		if(age < 40 || thisYear % 2 != year % 2){
			System.out.println("무료암검진 대상자가 아닙니다.");
		}else{
			String check = "위암,간암";
			if(age >= 50){
				check += ",대장암";
			}

			if(gender == 2 || gender == 4){
				check += ",유방암,자궁암";
			}
			System.out.println("무료암검진 대상자입니다.");
			System.out.println("검진항목은 " + check + "입니다.");
		}
	}
}
