import java.net.*;
import java.util.*;

public class NetworkEx1 {
	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip=InetAddress.getLocalHost();
			
			byte[] a = ip.getAddress();
//			System.out.println(Arrays.toString(a));
			
			
			int[] aa = { 255, 255, 255, 0 };
			
			String str = "";
			String str2 = "";
			
			for(int i=0; i<a.length; i++) {
			
				str += (a[i] < 0) ? a[i]+256 : a[i];
				str += ".";
				
				str2 += (a[i] & aa[i]);
				str2 += ".";
				
			}
			System.out.println(str);
			System.out.println(str2);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
