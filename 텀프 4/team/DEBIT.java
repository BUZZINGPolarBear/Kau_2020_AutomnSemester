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
		System.out.println("���������� �Է��� �ֽʽÿ�.");
		String temp1 = scan.next();
		int input_5 = Integer.parseInt(temp1);
		System.out.println("�������� �Է��� �ֽʽÿ�.");
		String temp2 = scan.next();
		int input_1 = Integer.parseInt(temp2);
		type=ATM.account.withdraw(input_5, input_1);
		switch (type) {
        case 1:
        	DBACCESS.DBUpdate(ATM.account);
    		CHECKWINDOW window = new CHECKWINDOW();
    		System.out.println("1.�α׾ƿ�\n"+"2.���θ޴�");
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
        	System.out.println("���� ����: ���� �ܰ� Ȯ���Ͽ� �ֽʽÿ�.");
        	System.out.println("1.�α׾ƿ�\n"+"2.���θ޴�");
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
        	System.out.println("���� ����: ATM �ܾ��� �����մϴ�.");
        	System.out.println("1.�α׾ƿ�\n"+"2.���θ޴�");
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
