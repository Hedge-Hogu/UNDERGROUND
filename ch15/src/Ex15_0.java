import java.io.*;
import java.util.StringTokenizer;

public class Ex15_0 {
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer("asdf|1823|123", "|");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
	}

}
