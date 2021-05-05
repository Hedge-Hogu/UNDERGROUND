class Box4<T extends Fruit2> {
	T item;
	
	void setItem(T item) { this.item = item; }
	T getItem() { return item; }
}

public class Box2Test {
	public static void main(String[] args) {
		Box4<?> b = new Box4();
	}

}
