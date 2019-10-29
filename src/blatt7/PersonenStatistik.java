package blatt7;

//Aufgabe 28
public class PersonenStatistik {
	
	public static int getMax(Person[] array) {
		int max = array[array.length - 1].getAlter();
		return max;
	}

	public static int getMin(Person[] array) {
		int min = array[0].getAlter();
		return min;
	}

	public static double getMed(Person[] array) {
		double med = 0;
		for (Person person : array) {
			med += person.getAlter();
		}
		med /= array.length;
		return med;
	}

	public static double getVar(Person[] array) {
		double var = 0;
		double med = getMed(array);
		for (Person person : array) {
			var = Math.pow((person.getAlter() - med), 2);
		}
		var /= array.length; 
		return var;
	}

}
