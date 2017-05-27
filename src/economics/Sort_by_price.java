package economics;

import java.util.Comparator;

public class Sort_by_price implements Comparator<Good> {

	@Override
	public int compare(Good o1, Good o2) {
		return (int) (o1.getPrice_of_good() - o2.getPrice_of_good());
	}

}
