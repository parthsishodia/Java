import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   // String s=sc.next();
	   String s=" P art h   ";
	    String op="";
	    
	    
	    for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        if(!Character.isWhitespace(ch))
	        {
	            op=op+ch;
	        }
	    }
	    System.out.print(op);
	  
		
	}
}
