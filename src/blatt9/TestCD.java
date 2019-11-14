package blatt9;

public class TestCD {
	
	public static void main(String[] args) {
		
		CD cd1 = new CD("Robbie Williams: Swing When You're Winning", 51, false);
		CD cd2 = new CD("Pink Floyd: Echoes - The Best Of Pink Floyd", 145, false);
		CD cd3 = new CD("Sting: All This Time - Live", 54, true);
		CD cd4 = new CD("Sarah Connor: Green Eyed Soul", 43, false);
		CD cd5 = new CD("Paul McCartney: Driving Rain", 51, true);
		
		System.out.println(cd1);
		System.out.println(cd2);
		System.out.println(cd3);
		System.out.println(cd4);
		System.out.println(cd5);

	}

}
