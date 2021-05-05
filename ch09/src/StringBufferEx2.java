
public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2= sb.append(23); // sb, sb2 = "0123"
		sb.append('4').append(56); 		 // sb, sb2 = "0123456"
		
		StringBuffer sb3 = sb.append(78);// sb, sb2, sb3 = "012345678"
		sb3.append(9.0); // sb, sb2, sb3 = "0123456789.0"
		System.out.println(sb2);
		System.out.println(sb3);
		
		System.out.println(sb.deleteCharAt(10));
		System.out.println(sb.delete(3, 6));
		System.out.println(sb.insert(3, "abc"));
		System.out.println("sb.length()="+sb.length());
		System.out.println(sb.replace(6, sb.length(), "END"));
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}

}
