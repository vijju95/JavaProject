package Comparable_Comparator;

import java.util.Comparator;

public class ComparatorMain2 implements Comparator<Comparatorr> {

	public int compare(Comparatorr o1, Comparatorr o2) {
		return o1.bank_Name.compareTo(o2.bank_Name);
	}

}
