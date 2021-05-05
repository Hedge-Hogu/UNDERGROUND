import java.util.*;

public class Exercise13_8 {
	
	Vector<String> words = new Vector<>();
	String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };
	
	int interval = 2*1000;
	
	WordGenerator wg = new WordGenerator();
	
	public static void main(String[] args) {
		Exercise13_8 game = new Exercise13_8();
		
		game.wg.start(); // Thread 실행
		
		Vector words = game.words;
		
		while(true) {
			System.out.println(words);
			
			String prompt = ">>";
			System.out.print(prompt);
			
			//화면으로부터 라인단위로 입력받고 입력값과 일치하는 라인을 인덱스를 이용해서 삭제함
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

