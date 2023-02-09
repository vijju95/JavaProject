package Inheritance;

class IPLTeam {
//	2. Create class IPLTeam with method play. Create child classes of IPLTeam
//	called as CSK, RCB. In main, call play from child class objects.
	int count=11;
	public void play() {
		System.out.println("Total no of players are : "+ count);
	}
}

class RCB extends IPLTeam {
	public void play() {
		super.play();
	}
}

class CSK extends RCB{
	public void play() {
		super.play();
	}
}

public class IPLTeam_assignment{
	public static void main(String[] args) {
		CSK c = new CSK();
		c.play();
	}
}