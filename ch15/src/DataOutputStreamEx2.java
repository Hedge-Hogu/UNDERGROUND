import java.io.*;
import java.util.Arrays;

public class DataOutputStreamEx2 {
	public static void main(String[] args) {
		try {
			ByteArrayOutputStream bos = null;
			DataOutputStream dos = null;
			
			byte[] result = null;
			
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			
			result = bos.toByteArray();
			System.out.println(Arrays.toString(result));
			
			String[] hex = new String[result.length];
			System.out.println(hex.length);
			
			for(int i=0; i<result.length; i++) {
				if(result[i] < 0) {
					hex[i] = String.format("%02x", result[i]+256);
				} else {
					hex[i] = String.format("%02x", result[i]);
					
				}
			}
			
			System.out.println("10진수 :"+Arrays.toString(result));
			System.out.println("16진수 :"+Arrays.toString(hex));
			
			dos.close(); // 보조 스트림 닫기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
