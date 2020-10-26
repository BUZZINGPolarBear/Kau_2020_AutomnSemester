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
		System.out.println("아이디를 입력해 주십시오.\n"+"종료하시려면 0을 입력해 주십시오.");
		String ID = scan.next();
		int input_ID = Integer.parseInt(ID);
		if(input_ID==0) {
			System.exit(0);
		}
		System.out.println("비밀번호를 입력해 주십시오.");
		String PASS = scan.next();
		int input_PASS = Integer.parseInt(PASS);
		account.ID = input_ID;
		account.pass = input_PASS;
		boolean login_sign = DBACCESS.DBLoad(ATM.account);
		if(login_sign==true) {
			System.out.println("로그인 성공");
			
		}else {
			System.out.println("로그인 실패");
		}
		MENU a = new MENU(login_sign);
		a.window();
	}

}
