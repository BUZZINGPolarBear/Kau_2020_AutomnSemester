import java.util.Scanner;
public class TERM extends MAIN{
	private boolean login,type;
	Scanner scan = new Scanner(System.in);
	public TERM(boolean login,boolean type) {
		// TODO Auto-generated constructor stub
		this.login = login;
		this.type = type;
	}
	@Override
	public void window() {
		// TODO Auto-generated method stub
		if(login==true && type==true) {
			TERMWINDOW window = new TERMWINDOW();
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
		}else {
			System.out.println("정기예금이 존재하지 않습니다.");
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

}
