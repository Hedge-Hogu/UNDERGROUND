import java.io.*;

public class FileHead {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("USAGE : java FileHead 10 FILENAME");
			System.exit(0);
		}
		
		int line = Integer.parseInt(args[0]);
		String filename = args[1];
		File f = new File(filename);
		
		if(!f.isFile()) {
			System.out.println(f+"은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
		}
		
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			String data ="";
			
			for(int i=1; i<=line; i++) {
				if((data=br.readLine())!=null)
					System.out.println(i+":"+data);
			}
			
			
			
//			while((data = br.readLine())!=null) {
//				System.out.println(data);
//			}
			br.close();
			
		} catch (IOException e) {
		}
		
		
		
	}

}
