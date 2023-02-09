package Inheritance;
// Herarical
	class Labro{
		String L="lovable";
		String L1="loyalcompanion";
		String C="Family pet";
		
		Labro() {
			System.out.println(L1);
		}
		
		void features(String nature) {
			System.out.println("labro are : "+ L);
		}	
	}
	
	class Husky extends Labro {
		String H="courageous";
		String H1="gentleness";
		String C="Smell sense";
		
		Husky() {
			System.out.println(L1);
		}
		
		void features() {
			System.out.println("Prot nature : "+ H);
			System.out.println(L);
			System.out.println(H);
			System.out.println(C);
			System.out.println(super.C);
		}
	}
	
	class pug extends Labro{
		String P="social";
		pug(){
			System.out.println(" default pug are : "+ C);
		}
		void features() {
			System.out.println("pug are : "+P);
			System.out.println("Smaill height");
			System.out.println("pug are : "+C);
		}
	}
	
	public class Animal_class {
		public static void main(String[] args) {
			Husky h = new Husky();
			pug p = new pug();
			p.features();
			h.features();
		}
	}