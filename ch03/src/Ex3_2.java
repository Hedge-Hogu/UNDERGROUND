
public class Ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=0;
		
		j = i;
		i++;
		System.out.println("j=i++; 실행 후 , i= " + i + ", j=" + j);
		
		i=5;
		j=0;
		
		++i;
		j = i;
		System.out.println("j=++i; 실행 후, i= " +i +", j = " +j);
	}
}
