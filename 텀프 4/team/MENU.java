import java.util.Scanner;

public class MENU extends MAIN {
	Scanner scan = new Scanner(System.in);
	private boolean sign;
	private boolean sign2=false;
	int a,b,c = 0;
	public MENU(boolean sign) {
		// TODO Auto-generated constructor stub
		this.sign = sign;
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
		if(sign==true) {
			System.out.println("1.�ܾ���ȸ\n"+"2.�Ա�\n"+"3.���\n"+"4.�ŷ����� ��ȸ\n"+"5.���⿹�� Ȯ��\n"+"6.�α׾ƿ�");
			String choice = scan.next();
			int choice_input = Integer.parseInt(choice);
			switch (choice_input) {
	        case 1: 	
	        	MAIN check = new CHECK(ATM.account.balance);
	        	check.window();
	            break;
	        case 2:
	        	MAIN deposit = new DEPOSIT(a, b);
	        	deposit.window();
	        	break;
	        case 3:
	        	MAIN debit = new DEBIT(a,b,c);
	        	debit.window();
	        	break;
	        case 4:
	        	MAIN record = new RECORD(ATM.account.record);
	        	record.window();
	        	break;
	        case 5:
	        	if(ATM.account.deposit>0)
	        		sign2 = true;
	        	MAIN term = new TERM(sign,sign2);
	        	term.window();
	        	break;
	        case 6:
	        	MAIN a = new LOGIN(ATM.account);
				a.window();
	        	break;
			}
		}else {
			MAIN a = new LOGIN(ATM.account);
			a.window();
		}
	}

}
