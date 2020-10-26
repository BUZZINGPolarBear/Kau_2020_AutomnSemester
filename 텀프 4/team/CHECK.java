import java.util.Scanner;

public class CHECK extends MAIN {
	Scanner scan = new Scanner(System.in);
	private int balance;
	public CHECK(int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
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
