import java.util.Scanner;
public class DEBIT extends MAIN {
	Scanner scan = new Scanner(System.in);
	private int money_5;
	private int money_1;
	private int type;
	public DEBIT(int money_5, int money_1, int type) {
		this.money_5 = money_5;
		this.money_1 = money_1;
		this.type = type;
		// TODO Auto-generated constructor stub
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
		type=ATM.account.withdraw(input_5, input_1);
		switch (type) {
        case 1:
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
        	break;
        case 2:
        	System.out.println("인출 실패: 통장 잔고를 확인하여 주십시오.");
        	System.out.println("1.로그아웃\n"+"2.메인메뉴");
        	String choice2 = scan.next();
    		int choice_input2 = Integer.parseInt(choice2);
    		switch (choice_input2) {
            case 1:
            	MAIN login = new LOGIN(ATM.account);
    			login.window();
                break;
            case 2:
            	MAIN menu = new MENU(true);
        		menu.window();
            	break;
    		}
        	break;
        case 3:
        	System.out.println("인출 실패: ATM 잔액이 부족합니다.");
        	System.out.println("1.로그아웃\n"+"2.메인메뉴");
        	String choice3 = scan.next();
    		int choice_input3 = Integer.parseInt(choice3);
    		switch (choice_input3) {
            case 1:
            	MAIN login = new LOGIN(ATM.account);
    			login.window();
                break;
            case 2:
            	MAIN menu = new MENU(true);
        		menu.window();
            	break;
    		}
        	break;
		}
		
	}

}
