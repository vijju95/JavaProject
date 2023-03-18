package CRUD;

public class ArrayListSub {

	int roll_Num;
	String name;
	String division;
	
	public ArrayListSub(int roll_Num, String name,String division){
		super();
		this.roll_Num=roll_Num;
		this.name=name;
		this.division=division;
	}

	public void getroll(int roll_Num) {
		this.roll_Num=roll_Num;
	}
	public int setroll() {
		return roll_Num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
	public String toString()
	{
		return roll_Num+" "+name+" "+division;
	}
}
