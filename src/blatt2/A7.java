package blatt2;

public class A7 {
	
	public static void main(String[] args) {
	
		//TODO: same result in 3 if-statements
		double a, b, c, d, e;
		a = 5;
		b = 7;
		c = 9;
		d = 3;
		
		if (b > a && c > b && d > c) {
			e = d;
		} else { 
			e = c;
		
		if (b > a)
			if (c > b)
				if (d > c)
					e = d;
				else
					e = c;
			else
				if (d > b)
					e = d;
				else
					e = b;
		else
			if (c > a)
				if (d > c)
					e = d;
				else
					e = c;
			else
				if (d > a)
					e = d;
				else
					e = a;
		System.out.println("e = " + e);
		
	}


	}
}
