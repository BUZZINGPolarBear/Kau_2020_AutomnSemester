public class CHECKWINDOW{
	
	static int balance;
	public static void main(String[] args) {
		new CHECKWINDOW() {};
	}

	// 생성자
	public CHECKWINDOW() {
		balance=ATM.account.balance;
		String message = "현재 잔액은 "+balance+"원 입니다.";
		System.out.println(message);
	}
}
