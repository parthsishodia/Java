import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    int len=s.length();
	    char ch[]=s.toCharArray();
	    for(int i=ch.length-1;i>=0;i--)
	    {
	        System.out.print(ch[i]);
	    }
		
	}
}
