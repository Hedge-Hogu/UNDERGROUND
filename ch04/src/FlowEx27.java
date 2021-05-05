
public class FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 : for(int i=2; i<=9; i++) {
					for(int j=1; j<=9; j++) {
						if(j==5)
//							break Loop1;
//							break;
//							continue Loop1;
							continue;
						System.out.println(i+"*"+j+"="+i*j);
					} //end of for j
					System.out.println("야 기분 좋다");
		}//end of loop1
	}

}
