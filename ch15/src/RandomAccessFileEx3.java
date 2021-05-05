import java.io.*;

public class RandomAccessFileEx3 {
	public static void main(String[] args) {
		int sum =0;
		
		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
			int i =12;
			
			while(true) {
				int tmp =0;
				raf.seek(i);
				System.out.println("FilePointer : "+raf.getFilePointer());
				System.out.println("readInt(): "+(tmp = raf.readInt()));
				System.out.println("sum :"+(sum += tmp));
				
//				System.out.println(sum += raf.readInt());
				i +=16;
			}
			
		} catch (EOFException eof) {
			System.out.println("final sum :"+sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
