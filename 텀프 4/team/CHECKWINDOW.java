public class CHECKWINDOW{
	
	static int balance;
	public static void main(String[] args) {
		new CHECKWINDOW() {};
	}

	// ������
	public CHECKWINDOW() {
		balance=ATM.account.balance;
		String message = "���� �ܾ��� "+balance+"�� �Դϴ�.";
		System.out.println(message);
	}
}
