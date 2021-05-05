import java.io.*;
import java.util.Arrays;
import java.util.Vector;

public class SequenceInputStreamEx {
	public static void main(String[] args) {
		byte[] arr1 ={0,1,2};
		byte[] arr2 ={3,4,5};
		byte[] arr3 ={6,7,8};
		byte[] tmp = new byte[3];
		byte[] outSrc = null;
		
		Vector<InputStream> v = new Vector<>();
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		SequenceInputStream input = new SequenceInputStream(v.elements());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data =0;
		
		try {
			while((input.read(tmp, 0, tmp.length))!=-1) {
				output.write(tmp);
				System.out.println(output.toByteArray());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("input Source1 :"+Arrays.toString(arr1));
		System.out.println("input Source2 :"+Arrays.toString(arr2));
		System.out.println("input Source3 :"+Arrays.toString(arr3));
		System.out.println("Output Source :"+Arrays.toString(outSrc));
	}

}
