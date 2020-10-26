import java.util.Scanner;
public class RECORD extends MAIN {
	private String record;
	Scanner scan = new Scanner(System.in);
	public RECORD(String record) {
		// TODO Auto-generated constructor stub
		this.record = record;
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
		RECORDWINDOW window = new RECORDWINDOW();
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
