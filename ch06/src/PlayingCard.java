
public class PlayingCard {
	int kind; // iv
	int num;  // iv
	
	static int width; // cv
	static int height;// cv
	
	PlayingCard(int k, int n) {
		kind =k;
		num = n;
	} // 생성자(인스턴스 메서드), k, n == lv; kind, num == iv;
	
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	} // card == lv;

}
