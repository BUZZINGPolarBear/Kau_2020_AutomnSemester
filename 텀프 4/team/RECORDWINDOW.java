public class RECORDWINDOW{
	
	public static void main(String[] args) {
		new RECORDWINDOW() {};
	}

	// ������
	public RECORDWINDOW() {
		String record = ATM.account.record; //record ������ �ŷ����� �����ؼ� ����ϱ�
		String[] array_record = record.split("\n");
		for(int i=0;i<array_record.length;i++) {
			String temp = array_record[i];
			System.out.println(temp);
		}
	}
}
