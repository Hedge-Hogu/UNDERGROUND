import java.io.*;

class SuperUserInfo {
	String name;
	String password;
	
	SuperUserInfo() {
		this("Sex1", "1111");
	}


	SuperUserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
} // SuperUserInfo

public class UserInfo2 extends SuperUserInfo implements Serializable {
	int age;

	public UserInfo2() {
		this("Sex2", "2222", 9);
	}
	
	public UserInfo2(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}

	@Override
	public String toString() {
		return "("+name+","+password+","+age+")";
	}
	
//	private void writeObject(ObjectOutputStream out) throws IOException {
//		out.writeUTF(name);
//		out.writeUTF(password);
//		out.defaultWriteObject();
//	}
	
//	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
//		name = in.readUTF();
//		password = in.readUTF();
//		in.defaultReadObject();
//	}
	
	
	
	
	

}
