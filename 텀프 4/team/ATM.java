import java.util.Calendar;
public class ATM {
	static int money5=200;
	static int money1=1000;
	static ACCOUNT[] accounts = new ACCOUNT[2];
	static ACCOUNT account1 = new ACCOUNT(0);
	static ACCOUNT account2 = new ACCOUNT(0);
	static ACCOUNT account = new ACCOUNT(0);
	static int select=0;						//첫번째 초기 화면 메뉴 선택 변수
	public static final int SCREEN_WIDTH = 500;
	public static final int SCREEN_HEIGHT = 520;
	static boolean input_money = false;	
	
	public static void main(String[] args) {
		account1.ID = 1234;
		account1.pass = 1234;
		account1.balance = 0;
		account1.record = "";
		account1.deposit = 0;
		account1.month = 0;
		account1.year = 0;
		account2.ID = 4321;
		account2.pass = 4321;
		account2.balance = 25000000;
		account2.record = "";
		account2.deposit = 100000;
		account2.month = 11;
		account2.year = 2019;
		accounts[0] = account1;
		accounts[1] = account2;
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("JAVA와 OOP G조 은행에 오신걸 환영합니다.\n현재 시각은"+hour+"시 입니다.");
		if(hour==7 && input_money == false) {															   //7시 지폐 초기화
			money1 = money1+1000;
			money5 = money5+200;
			input_money = true;
		}
		MAIN a = new LOGIN(account);
		a.window();
	}
}
