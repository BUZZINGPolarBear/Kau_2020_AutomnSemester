import java.util.Calendar;
public class ACCOUNT    				//���� ��ü
	{
		int balance; 					//��ġ�� 
		int ID=0;						//ID
		int pass = 0;
		int deposit=0;					//���⿹��
		int month = 0;					//�Ա��Ѵ�
		int year = 0;					//�Աݳ⵵
		String record = "";				//���� �ŷ�����
		Calendar cal = Calendar.getInstance();
		public ACCOUNT(int initialBalance)   	//���� ������
		{
			if(initialBalance>0.0)				//0�ʰ��� �ݾ��� ��츸 �ش�ݾ����� �ʱ�ȭ(�̸��� ��� 0)
			{
				balance = initialBalance;
			}
		}
		
		public double getBalance()				//������ ��ġ���� Ȯ���ϴ� method(return=balance)
		{
			return balance;
		}
		
		public void credit(int money_5, int money_1)			//�ݾ��� �Ա��ϴ� method
		{
			int amount = money_5*50000+money_1*10000;
			ATM.money5 = money_5+ATM.money5;
			ATM.money1 = money_1+ATM.money1;
			record = record+"\n"+cal.get(cal.YEAR)+"�� "+(cal.get(cal.MONTH)+1)+"�� "+cal.get(cal.DATE)+"�� "+cal.get(cal.HOUR)+"�ÿ� "+amount+"�� �Ա��Ͽ����ϴ�."+"\n";
			balance = balance + amount;
		}
		
		public int withdraw(int money_5, int money_1)		//�ݾ��� �����ϴ� method
		{
			int amount = money_5*50000+money_1*10000;
			if(balance>=amount && money_5<=ATM.money5 && money_1<=ATM.money1)					//����ݾ��� �����ܾ� ���� ���� ��츸 ����
			{
				record = record+"\n"+cal.get(cal.YEAR)+"�� "+(cal.get(cal.MONTH)+1)+"�� "+cal.get(cal.DATE)+"�� "+cal.get(cal.HOUR)+"�ÿ� "+amount+"�� �����Ͽ����ϴ�."+"\n";
				balance = balance - amount;
				return 1;
			}
			else if(amount>=balance)							//����ݾ��� �����ܾ� ���� ���� ��� ���� ���� ���
			{
				return 2;
			}else {
				return 3;
			}
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
	}

