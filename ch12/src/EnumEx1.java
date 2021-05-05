enum Direction2 {EAST, SOUTH, WEST, NORTH }

public class EnumEx1 {
	public static void main(String[] args) {
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.valueOf("WEST");
		Direction2 d3 = Enum.valueOf(Direction2.class, "EAST");
		
		System.out.println();
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		System.out.println();
		System.out.println("d1==d2 ?"+(d1==d2));
		System.out.println("d1==d3 ?"+(d1==d3));
		System.out.println("d1.equals(d3) ?"+d1.equals(d3));
//		System.out.println("d2 > d3 ?"+(d2 > d3));
		System.out.println("d1.compareTo(d3) ?"+(d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ?"+(d1.compareTo(d2)));
		System.out.println();
		switch(d3) {
			case EAST:
				System.out.println("The direction is EAST.");
				break;
			case WEST:
				System.out.println("The direction is WEST.");
				break;
			case NORTH:	
				System.out.println("The direction is NORTH.");
				break;
			default:
				System.out.println("Invalid direction.");
				break;
		}
		System.out.println();
		Direction2[] dArr = Direction2.values();
		
		for(Direction2 d : dArr)
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
	}

}
