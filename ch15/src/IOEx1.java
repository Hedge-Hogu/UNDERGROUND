import java.io.*;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[inSrc.length];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc); //inSrc를 inputStream에 담음
		output= new ByteArrayOutputStream();
		
		input.read(temp, 0, temp.length); // input stream에 담겨있는걸 읽어서 temp에 담음
		output.write(temp, 5, 5); //output stream에다가 쓴다
		
		
//		int data =0;
//		while((data = input.read())!=-1) {
//			output.write(data);
//		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source  :"+Arrays.toString(inSrc));
		System.out.println("temp          :"+Arrays.toString(temp));
		System.out.println("Output Source :"+Arrays.toString(outSrc));
	}

}
