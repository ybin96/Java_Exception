package study;

class NotFoundException extends Exception{
	public NotFoundException(String msg){
		super(msg);
	}
}

class SearchArray{
	public SearchArray(double []arr, double value)  throws NotFoundException {
		int i;
		for(i=0; i<arr.length; i++ ){
			if(arr[i] == value){
				System.out.println("찾고자 하는 " + value + "는 배열의 "+i+"번째에 있습니다.");
				break;
			}
		}				
		if(i == arr.length){
			throw new NotFoundException("찾고자 하는 데이터 "+ value+"은 배열에 없습니다.");
		}
	}
}
class SearchArrayTest {
	public static void main(String[] args) {		
		try{
			double []data = {26.7, 35.8, 6.9, 7.2};   //   35.8
			//SearchArray sa = new SearchArray(data, 35.8);
			SearchArray sa = new SearchArray(data, 40.5);
		}catch(  NotFoundException e   ){
			System.out.println("예외발생:" +  e.getMessage() );
		}
	}
}

