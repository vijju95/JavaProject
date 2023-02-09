package Abstraction;
//3. Create interface Cake with a method declared as bake. Create 2 classes

//Strawberry, BlackForest both implementing Cake interface.

interface cake {
	void bake();
}

class Blackforest implements cake {
	public void bake() {
		System.out.println("Baking blackforest cake");
	}
}

class Strawberry implements cake {
	public void bake() {
		System.out.println("Baking strawberry cake");
	}
}

public class Interface_assignment {
	public static void main(String[] args) {

		cake c = new Blackforest();
		c.bake();

		cake b = new Strawberry();
		b.bake();
	}
}
