public class DBACCESS {
	static ACCOUNT account1 = ATM.account;
	static boolean login_sign = false
			;
	public static boolean DBLoad(ACCOUNT account1) {
		for(int i = 0; i<ATM.accounts.length;i++) {
			if(ATM.accounts[i].ID==account1.ID) {
				if(ATM.accounts[i].pass == account1.pass) {
					account1.balance = ATM.accounts[i].balance;
					account1.record = ATM.accounts[i].record;
					account1.deposit = ATM.accounts[i].deposit;
					account1.year = ATM.accounts[i].year;
					account1.month = ATM.accounts[i].month;
					login_sign = true;
				}
			}
		}
		return login_sign;
	}
	public static ACCOUNT DBUpdate(ACCOUNT account1){ 						//DB에 계좌 정보 업데이트 class
		for(int i = 0; i<ATM.accounts.length;i++) {
			if(ATM.accounts[i].ID==account1.ID) {
				if(ATM.accounts[i].pass == account1.pass) {
					ATM.accounts[i].balance = account1.balance;
					ATM.accounts[i].record = account1.record;
					ATM.accounts[i].deposit = account1.deposit;
					ATM.accounts[i].year = account1.year;
					ATM.accounts[i].month = account1.month;
					login_sign = true;
				}
			}
		}
		return account1;
	}
}
