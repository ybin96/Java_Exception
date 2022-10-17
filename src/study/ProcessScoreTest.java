package study;

class IlleagalScore extends Exception{
	public IlleagalScore(String msg){
		super(msg);
	}
}



class ProcessScore{
	public ProcessScore(int []score) throws IlleagalScore {
		int total = 0;
		for(int i=0; i<score.length; i++){
			if( score[i] < 0){
				throw new IlleagalScore("점수가 음수가 될 수 없어요!");
			}
			total += score[i];
		}
		int avg = total / score.length;
		System.out.println("평균점수:" + avg);
	}
}
class  ProcessScoreTest{
	public static void main(String[] args) {
		try{
			int []data = {90,80,92,75,100};
	//		int []data = {90,-80,92,75,100};
			ProcessScore ps = new ProcessScore(data);		
		}catch( IlleagalScore e ){
			System.out.println("예외발생:" + e.getMessage());
		}
	}
}
