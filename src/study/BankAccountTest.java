package study;

class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String msg){
		super(msg);
	}
}

class BankAccount{
	private int balance;
	public void deposit(int amount){
		balance += amount;
		System.out.println(amount+"원을 입금하여 잔액:" + balance);
	}
	public void withdraw(int amount) throws NegativeBalanceException{
		//잔액이 찾을 돈 보다 작다면
		if(balance <  amount ){
			throw new NegativeBalanceException("잔액이 부족합니다. 잔액:"+balance+", 인출액:"+amount);
		}
		balance -= amount;
		System.out.println(amount+"원을 인출하여 잔액:" + balance);
	}
}

class BankAccountTest {
	public static void main(String[] args){
		try{
			BankAccount ac = new BankAccount();
			ac.deposit(10000);
			ac.withdraw(6000);
			ac.withdraw(6000);
		}catch(NegativeBalanceException e){
			System.out.println("예외발생:" + e.getMessage());
		}
	}
}
