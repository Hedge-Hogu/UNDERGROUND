import java.io.*;

public class FileMerge {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE : java FileMerge filename");
			System.exit(0);
		}
		
		String mergeFilename = args[0];
		
		try {
			File tempFile = File.createTempFile("~mergetemp", ".tmp");
			tempFile.deleteOnExit();
			
			FileOutputStream fos = new FileOutputStream(tempFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			BufferedInputStream bis = null;
			
			int number = 1;
			
			File f = new File(mergeFilename+"_."+number);
			
			while(f.exists()) {
				f.setReadOnly(); // 도중에 변경 안되도록 일기전용으로 설정
				bis = new BufferedInputStream(new FileInputStream(f));
				
				int data =0;
				while((data=bis.read())!=-1) {
					bos.write(data);
				}
				bis.close(); // inputStream 닫는다 (새로 만들어서 다음 소스 파일 지정)
				
				f = new File(mergeFilename+"_."+ ++number);
			}
			
			bos.close();
			
			File oldFile = new File(mergeFilename);
			if(oldFile.exists())
				oldFile.delete();
			tempFile.renameTo(oldFile);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("저장된 위치 : "+ System.getProperty("java.io.tmpdir"));
	} // main

}
