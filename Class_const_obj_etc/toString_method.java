package Class_const_obj_etc;

public class toString_method {

	int account_Num;
	String bank_Name;
	float balance;
	
	toString_method(int account_Num,String bank_Name,float balance){
		this.account_Num=account_Num;
		this.bank_Name=bank_Name;
		this.balance=balance;
	}
	
	public String toString() {								//overriding the to string method
		return "Bank details : "+account_Num+" "+bank_Name+" "+balance;
	}
	
	public static void main(String[] args) {
		toString_method t = new toString_method(1234, "sbi", 20.5f);
		System.out.println(t.toString());
	}
}
