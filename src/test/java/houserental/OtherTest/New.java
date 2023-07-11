package houserental.OtherTest;

import java.util.Random;

public class New {
	public static void main(String[] args) {
		Random r=new Random();
		String s="";
		for(int i=0;i<10;i++) {
			int n = r.nextInt(10);
			s=s+n;
			
		}
		System.out.println(s);
	}

}
