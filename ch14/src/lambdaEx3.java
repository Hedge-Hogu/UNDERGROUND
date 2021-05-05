@FunctionalInterface
interface MyFunction {
	void myMethod();
}

class Outer {
	int val=10; //Outer.this.val
	
	Inner inner = new Inner();
	
	class Inner {
		int val =20; // this.val
		
		void method(int i) {
			int val =30; // final int val=30;
//			i = 10; // 에러 상수의 값을 변경할수 없음
			
			MyFunction f = () -> {
				System.out.println("             i :"+i);
				System.out.println("           val :"+val);
				System.out.println("      this.val :"+this.val);
				System.out.println("Outer.this.val :"+Outer.this.val);
			};
			
			f.myMethod();
		}
	}
}

public class lambdaEx3 {

	public static void main(String[] args) {
		Outer outer = new Outer();
//		Outer.Inner inner = outer.new Inner(); // 내부 클래스 생성
		outer.inner.method(100);
	}

}
