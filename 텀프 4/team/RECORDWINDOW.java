public class RECORDWINDOW{
	
	public static void main(String[] args) {
		new RECORDWINDOW() {};
	}

	// 생성자
	public RECORDWINDOW() {
		String record = ATM.account.record; //record 변수에 거래내역 저장해서 출력하기
		String[] array_record = record.split("\n");
		for(int i=0;i<array_record.length;i++) {
			String temp = array_record[i];
			System.out.println(temp);
		}
	}
}
