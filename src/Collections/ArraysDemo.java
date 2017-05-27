package Collections;

import java.awt.DisplayMode;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) 
			array[i] = -3 * i;
		
		System.out.println("Вхідний масив: ");
		display(array);
		Arrays.sort(array);
		System.out.print("Відсортований масив: ");
		display(array);
		
		Arrays.fill(array, 2, 6, -1);
		System.out.print("Масив після виклику методу fill(): ");
		display(array);
		
		
		Arrays.sort(array);
		System.out.println("Масив після повторного сортування: ");
		display(array);
		
		System.out.println("Значення -9 знаходиться на позиції ");
		int index = Arrays.binarySearch(array, -9);
		System.out.println(index);
		
		
	}

	private static void display(int[] array) {
		for (int i : array)
			System.out.print(i);
		System.out.println();
	}

}
