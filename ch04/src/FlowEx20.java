
public class FlowEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��, ���� ī��Ʈ�ٿ��� �����մϴ�.");
		for(int i =10; i >= 0; i--) {
			for(int j =0; j < 1_000_000_000; j++) {}
			System.out.println(i);
		} // end of for1
		System.out.println("GAME OVER");
	}
}
