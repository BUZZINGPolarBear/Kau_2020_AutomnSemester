import java.util.Scanner;

public class LOGIN extends MAIN {
	Scanner scan = new Scanner(System.in); 
	private ACCOUNT account;
	public LOGIN(ACCOUNT account) {
		// TODO Auto-generated constructor stub
		this.account = account;
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
		System.out.println("���̵� �Է��� �ֽʽÿ�.\n"+"�����Ͻ÷��� 0�� �Է��� �ֽʽÿ�.");
		String ID = scan.next();
		int input_ID = Integer.parseInt(ID);
		if(input_ID==0) {
			System.exit(0);
		}
		System.out.println("��й�ȣ�� �Է��� �ֽʽÿ�.");
		String PASS = scan.next();
		int input_PASS = Integer.parseInt(PASS);
		account.ID = input_ID;
		account.pass = input_PASS;
		boolean login_sign = DBACCESS.DBLoad(ATM.account);
		if(login_sign==true) {
			System.out.println("�α��� ����");
			
		}else {
			System.out.println("�α��� ����");
		}
		MENU a = new MENU(login_sign);
		a.window();
	}

}
