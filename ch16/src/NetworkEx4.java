import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx4 {
	public static void main(String[] args) throws IOException {
		URL url = null;
		BufferedReader input = null;
		String address = "https://ko.wikipedia.org/wiki/HTML";
//		url = new URL(address);
		String line = "";
		
//		URLConnection conn = url.openConnection();
		
//		System.out.println(conn.getHeaderFields().get("Content-Type"));
//		List<String> tmp = conn.getHeaderFields().get("Content-Type");
//		System.out.println(tmp.size());
//		
//		Iterator<String> it = tmp.iterator();
//		
//		
//		while(it.hasNext())
//			System.out.println(it.next());
		
		try {
			url = new URL(address);
			input = new BufferedReader(
						new InputStreamReader(
								(url.openConnection().getInputStream()), "UTF-8"
						)
					);
			
			
			while((line = input.readLine())!=null) {
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(input!=null)
					input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
