import java.util.*;

public class Exercise13_8 {
	
	Vector<String> words = new Vector<>();
	String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };
	
	int interval = 2*1000;
	
	WordGenerator wg = new WordGenerator();
	
	public static void main(String[] args) {
		Exercise13_8 game = new Exercise13_8();
		
		game.wg.start(); // Thread ����
		
		Vector words = game.words;
		
		while(true) {
			System.out.println(words);
			
			String prompt = ">>";
			System.out.print(prompt);
			
			//ȭ�����κ��� ���δ����� �Է¹ް� �Է°��� ��ġ�ϴ� ������ �ε����� �̿��ؼ� ������
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			
			int index = words.indexOf(input);
			
			if(index!=-1) {
				words.remove(index);
			}
		}
	}

	class WordGenerator extends Thread {
		@Override
		public void run() {
			while(true) {
				int idx = (int)(Math.random()*data.length);
				words.add(data[idx]);
				
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {}
			} // while
		}
		
	}
}

