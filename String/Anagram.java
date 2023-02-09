package String;

public class Anagram {

	public static void main(String[] args) {
		
		String s="peek";
		String s1="sddsfd";
		
		char[] ch=s.toCharArray();
		char[] ch1=s1.toCharArray();
		
		char temp=0;
		int i=0;
			for(i=0;i<ch.length;i++) {
				
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]>ch[j]) {
						temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
				System.out.println(ch[i]);
			}
			for(i=0;i<ch1.length;i++) {
				for(int j=i+1;j<ch1.length;j++) {
					if(ch1[i]>ch1[j]) {
						temp=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;
					}
				}
				System.out.println(ch[i]);
				System.out.println(ch1[i]);
			}
			if(ch[i]==ch1[i]) {
				System.out.println("Anagram");
			}else
				System.out.println("Not Anagram");
	}
}
