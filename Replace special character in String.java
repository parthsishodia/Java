import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    String plaintext=s.replaceAll("[^a-zA-Z0-9]","");
	    System.out.print(plaintext);
	    
		
	}
}
