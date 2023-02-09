package Encapsulation;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private int netSalary;
	
	void setid(int id) {
		employeeId=id;
	}
	int getid() {
		return employeeId;
	}
	
	void setE_name(String n) {
		employeeName=n;
	}
	String getE_name() {
		return employeeName;
	}
	
	void setE_salary(double s) {
		salary=s;
	}
	double getE_salary() {
		return salary;
	}
	
	void setE_netSalary(int s) {
		netSalary=s;
	}
	int  getE_netSalary() {
		return netSalary;
	}
}
