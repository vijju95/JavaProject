package Encapsulation;

public class Detailemployee {

	public static void main(String[] args) {

		Employee E=new Employee();
		
		E.setid(101);
		E.setE_name("Vivek");
		E.setE_salary(20000);
		E.setE_netSalary(20000-((7*20000)/100));
		E.setE_netSalary(50000);
		
		
		System.out.println(E.getid());
		System.out.println(E.getE_name());
		System.out.println(E.getE_salary());
		System.out.println(E.getE_netSalary());
		
		
		//System.out.println(E.getE_netSalary());
		 
	}

}
