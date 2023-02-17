package ArrayListC;

import java.util.Comparator;

public class EmpCmprtCmrbl2 implements Comparator<employee>{

	public int compare(employee o1, employee o2) {
		return o1.name.compareTo(o2.name);
	}

}
