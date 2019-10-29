package blatt7;

public class PersonenSort {
	
	public static void bubbleSort(Person[] array) {
		//bubble sort
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				Person p1 = array[j];
				Person p2 = array[j + 1];
				
				if (p1.getAlter() > p2.getAlter()) {
					array[j + 1] = p1;
					array[j] = p2;
				}
				
			}
		}
		
	}

}
