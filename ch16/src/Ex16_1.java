import java.net.*;
import java.util.Arrays;

public class Ex16_1 {
	public static void main(String[] args) throws Exception {
		if(args.length!=2) {
			System.out.println("USAGE: java Ex16_1 Ip_Address subnet_Mask");
			System.exit(0);
		}
		
//		String ipAddress = "192.168.10.100";
//		String subnetMask = "255.255.255.0";
		
		String[] str = args[0].split("\\.");
		String[] str2 = args[1].split("\\.");
		
		String tmp = "";
		
		if(str.length==str2.length) {
			for(int i=0; i<str.length; i++) {
				tmp += (Integer.parseInt(str[i]) & Integer.parseInt(str2[i]))+".";
			}
			System.out.println("네트워크 주소:"+tmp);
		} else {
			throw new Exception("에러 발생!");
		}
		
		String[] str3 = tmp.split("\\.");
		
		String tmp2 = "";
		for(int i=0; i<str.length; i++) {
			tmp2 += (Integer.parseInt(str[i]) &~ Integer.parseInt(str3[i]))+".";
		}
		
		System.out.println("호스트 주소:"+tmp2);
		
	} // main
} // class
