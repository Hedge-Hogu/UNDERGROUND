
public class PlayingCard {
	int kind; // iv
	int num;  // iv
	
	static int width; // cv
	static int height;// cv
	
	PlayingCard(int k, int n) {
		kind =k;
		num = n;
	} // ������(�ν��Ͻ� �޼���), k, n == lv; kind, num == iv;
	
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	} // card == lv;

}
