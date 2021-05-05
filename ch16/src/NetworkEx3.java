import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {
	public static void main(String[] args) {
		URL url = null;
		String address = "https://ko.wikipedia.org/wiki/HTML";
		
		
		
		try {
			url = new URL(address);
			String host = url.getHost();
			InetAddress ip = null;
			ip = InetAddress.getLocalHost();
			
//			ip = InetAddress.getByName(host);
			
			System.out.println(ip.getHostAddress());
			;
			
			
			;
			
			
			InetAddress[] ips = InetAddress.getAllByName(host);
			
			for(InetAddress i : ips)
				System.out.println(i.getHostAddress());
			
			
			
			
//			System.out.println(InetAddress.getByName());
//			System.out.println(ip.getHostAddress());
			
			
			URLConnection conn = url.openConnection();
//			System.out.println(conn.toString());
//			System.out.println(conn.getURL());
//			System.out.println(conn.getAllowUserInteraction());
//			System.out.println(conn.getConnectTimeout());
//			System.out.println(conn.getContent());
//			System.out.println(conn.getContentEncoding());
//			System.out.println(conn.getContentLength());
//			System.out.println(conn.getContentType());
//			System.out.println(conn.getDate());
			
//			Date d = new Date(conn.getDate());
//			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
//			System.out.println(df.format(d));
//			System.out.println(conn.getDefaultAllowUserInteraction());
//			System.out.println(conn.getDefaultUseCaches());
//			System.out.println(conn.getDoInput());
//			System.out.println(conn.getDoOutput());
//			System.out.println(conn.getExpiration());
			System.out.println(conn.getHeaderFields());
//			System.out.println(conn.getIfModifiedSince());
//			System.out.println(conn.getLastModified());
//			System.out.println(conn.getReadTimeout());
//			System.out.println(conn.getURL());
//			System.out.println(conn.getUseCaches());
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
