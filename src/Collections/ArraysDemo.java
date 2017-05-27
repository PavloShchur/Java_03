package Collections;

import java.awt.DisplayMode;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) 
			array[i] = -3 * i;
		
		System.out.println("������� �����: ");
		display(array);
		Arrays.sort(array);
		System.out.print("³����������� �����: ");
		display(array);
		
		Arrays.fill(array, 2, 6, -1);
		System.out.print("����� ���� ������� ������ fill(): ");
		display(array);
		
		
		Arrays.sort(array);
		System.out.println("����� ���� ���������� ����������: ");
		display(array);
		
		System.out.println("�������� -9 ����������� �� ������� ");
		int index = Arrays.binarySearch(array, -9);
		System.out.println(index);
		
		
	}

	private static void display(int[] array) {
		for (int i : array)
			System.out.print(i);
		System.out.println();
	}

}
