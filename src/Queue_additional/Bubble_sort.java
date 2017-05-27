package Queue_additional;
import java.util.Arrays;

public class Bubble_sort {
	



		public static void main(String[] args) {
			int massive [] = new int [] {9, 16, 4, 11, 14, 6, 2, 8, 1, 12, 13, 3, 10, 7};
			int i = 0;
			int numberOfGoodPairs = 0;
			
			long t0 = System.currentTimeMillis();
			
			while (true) {
				if (massive[i] > massive[i + 1]) {
					int sort;
					sort = massive [i];
					massive [i] = massive [i + 1];
					massive [i + 1] = sort;
					numberOfGoodPairs = 0;
				} else {
					numberOfGoodPairs++;
				}
				if (numberOfGoodPairs == massive.length - 1) break;
				i++;
				if ( i == massive.length - 1) {
				i = 0;
				}
				System.out.println(Arrays.toString(massive) + " " + numberOfGoodPairs);
			}
			
			long t1 = System.currentTimeMillis();
			System.out.println(t1 - t0 + "ms");
			
		}

	}


