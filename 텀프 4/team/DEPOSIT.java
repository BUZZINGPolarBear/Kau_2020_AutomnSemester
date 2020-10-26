import java.util.Scanner;
public class DEPOSIT extends MAIN {
	Scanner scan = new Scanner(System.in);
	private int money_5;
	private int money_1;
	public DEPOSIT(int money_5, int money_1) {
		// TODO Auto-generated constructor stub
		this.money_5 = money_5;
		this.money_1 = money_1;
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
		System.out.println("오만원권을 입력해 주십시오.");
		String temp1 = scan.next();
		int input_5 = Integer.parseInt(temp1);
		System.out.println("만원권을 입력해 주십시오.");
		String temp2 = scan.next();
		int input_1 = Integer.parseInt(temp2);
		ATM.account.credit(input_5, input_1);
		DBACCESS.DBUpdate(ATM.account);
		CHECKWINDOW window = new CHECKWINDOW();
		System.out.println("1.로그아웃\n"+"2.메인메뉴");
		String choice = scan.next();
		int choice_input = Integer.parseInt(choice);
		switch (choice_input) {
        case 1:
        	MAIN login = new LOGIN(ATM.account);
			login.window();
            break;
        case 2:
        	MAIN menu = new MENU(true);
    		menu.window();
        	break;
		}
	}

}
