package ThreadS;

class Execution extends Thread{
	private int count=0;
	public void run() {
		
		count++;
		System.out.println("Priority of threaf is : "+Thread.currentThread().getPriority());
		System.out.println("State of thread : "+Thread.currentThread().getState());
		for(int i=0;i<5;i++) {
			System.out.println("Value of i : "+i);
		}
		
	}
}
public class Thread1 {
	
	public static void main(String[] args) {
		
		Execution t=new Execution();
		Execution tt=new Execution();
		System.out.println("State of thread : "+t.getState());
		System.out.println("State of thread : "+tt.getState());
		t.start();
		tt.start();
		
	}
}

