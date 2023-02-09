package String;

public class Space {

	public static void main(String[] args) {
		

	String s1=" I AM  SONAL  PAWAR";
	String s=s1.trim();
	char[] ch=s.toCharArray();
	
	for(int i=0; i<ch.length;i++) {
		if(ch[i]==' '+' ') {
			//if front space is also there then remove extra space
			
		}
		System.out.println(ch);
	}
	}
}
