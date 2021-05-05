class Data_1 {
	int value;
}

class Data_2 {
	int value;
	static int value2;
	
	Data_2(int x) {
		
		this.value = 3;
		System.out.println(this);
	}
}


public class Ex6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(1);
		Data_2.value2 =1;
		System.out.println(d1.value);
		
		
		

	}

}
