class Person {
	long id;

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id;
		else 
			return false;
	}
	
	Person(long id) {
		this.id = id;
	}
}
public class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(801108L);
		Person p2 = new Person(801108L);
		
		if(p1==p2)
			System.out.println("p1과 p2는 같다");
		else
			System.out.println("p1과 p2는 다르다");
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같다");
		else
			System.out.println("p1과 p2는 다르다");
	}

}
