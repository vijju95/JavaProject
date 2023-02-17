package HashMapC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 	create HashMap which contain String as key and Integer as value
	key is name of city and value is frequency of that city;
 */
class CitySub {

	String city;
	int frequency;

	CitySub(String city, int frequency) {
		this.city = city;
		this.frequency = frequency;
	}

	public String toString() {
		return "\n" + "Name of the city is : " + city + "\n" + "Frequency of city is : " + frequency;
	}
}

public class CityHM {

	public static void main(String[] args) {
		HashMap<Integer, CitySub> hm = new HashMap<>();
		CitySub c = new CitySub("pune", 5);
		hm.put(1, c);
		hm.put(2, new CitySub("mumbai", 3));
		hm.put(3, new CitySub("chennai", 4));

		Set<Entry<Integer, CitySub>> set = hm.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}