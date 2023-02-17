package ArrayListC;

import java.util.ArrayList;
import java.util.Iterator;

class Movie {

	int movieid;
	int rating;
	String name;
	
	public Movie(int movieid, int rating, String name) {
		this.movieid = movieid;
		this.rating = rating;
		this.name = name;
	}
	
	public String toString() {
		return "Movie [movieid=" + movieid + ", rating=" + rating + ", name=" + name + "]";
	}	
}

public class Arraylist_Movie {

	public static void main(String[] args) {
		Movie m=new Movie(101, 2, "Avatar");
		Movie m1=new Movie(102, 1, "Sultan");
		Movie m2=new Movie(103, 4, "Pathan");
		Movie m3=new Movie(104, 5, "RRR");
		
		ArrayList<Movie> al= new ArrayList<Movie>();
		
		al.add(m2);
		al.add(m3);
		al.add(m1);
		al.add(m);
				
		Iterator<Movie> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
