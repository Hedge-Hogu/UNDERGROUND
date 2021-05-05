
public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ball = new int[45];
		
		for(int i=0; i <ball.length; i++) {
			ball[i] = i+1;
//			System.out.println("ball["+i+"]="+ball[i]);
		}
		
		int temp =0;
		int j =0;
		
		for(int i=0; i <100; i++) {
			j= (int)(Math.random()*45);
			temp = ball[0];
			ball[0]=ball[j];
			ball[j]=temp;
//			System.out.println("temp="+temp+", ball[0]="+ball[0]+", ball["+j+"]="+ball[j]);
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
	}

}
