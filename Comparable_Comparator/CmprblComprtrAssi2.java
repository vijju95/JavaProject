package Comparable_Comparator;

import java.util.Comparator;

public class CmprblComprtrAssi2 implements Comparator<CRableAssignment>{

	@Override
	public int compare(CRableAssignment o1, CRableAssignment o2) {
		return o1.designation.compareTo(o2.designation);
	}

	
}
