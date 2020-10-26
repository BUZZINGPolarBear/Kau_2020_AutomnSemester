public class TERMWINDOW{
	public static void main(String[] args) {
		new TERMWINDOW() {};
	}
	public TERMWINDOW() {
		String message = ATM.account.year+"년 "+ATM.account.month+"월 예금하신 "+ATM.account.deposit+"원 입니다.";
		System.out.println(message);
	}
}
