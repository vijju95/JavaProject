package Class_const_obj_etc;

public class ReturnKeyword {

	int sum=0;
	
	public int display(){
		 for(int i=1; i<=10;i++) {
			 sum=sum+i;
		 }
		 return sum;
	 }// jyala return krto tyacha return type method la asla pahije int or char or string...
	
	public static void main(String[] args) {
		
		ReturnKeyword r = new ReturnKeyword();
		System.out.println(r.display());
	}
}
