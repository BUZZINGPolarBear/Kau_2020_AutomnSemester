import java.util.Calendar;
public class ACCOUNT    				//계좌 객체
	{
		int balance; 					//예치금 
		int ID=0;						//ID
		int pass = 0;
		int deposit=0;					//정기예금
		int month = 0;					//입금한달
		int year = 0;					//입금년도
		String record = "";				//계좌 거래내역
		Calendar cal = Calendar.getInstance();
		public ACCOUNT(int initialBalance)   	//계좌 생성자
		{
			if(initialBalance>0.0)				//0초과의 금액일 경우만 해당금액으로 초기화(미만일 경우 0)
			{
				balance = initialBalance;
			}
		}
		
		public double getBalance()				//계좌의 예치금을 확인하는 method(return=balance)
		{
			return balance;
		}
		
		public void credit(int money_5, int money_1)			//금액을 입금하는 method
		{
			int amount = money_5*50000+money_1*10000;
			ATM.money5 = money_5+ATM.money5;
			ATM.money1 = money_1+ATM.money1;
			record = record+"\n"+cal.get(cal.YEAR)+"년 "+(cal.get(cal.MONTH)+1)+"월 "+cal.get(cal.DATE)+"일 "+cal.get(cal.HOUR)+"시에 "+amount+"원 입금하였습니다."+"\n";
			balance = balance + amount;
		}
		
		public int withdraw(int money_5, int money_1)		//금액을 인출하는 method
		{
			int amount = money_5*50000+money_1*10000;
			if(balance>=amount && money_5<=ATM.money5 && money_1<=ATM.money1)					//인출금액이 예금잔액 보다 많은 경우만 인출
			{
				record = record+"\n"+cal.get(cal.YEAR)+"년 "+(cal.get(cal.MONTH)+1)+"월 "+cal.get(cal.DATE)+"일 "+cal.get(cal.HOUR)+"시에 "+amount+"원 인출하였습니다."+"\n";
				balance = balance - amount;
				return 1;
			}
			else if(amount>=balance)							//인출금액이 예금잔액 보다 적을 경우 에러 문구 출력
			{
				return 2;
			}else {
				return 3;
			}
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
	}

