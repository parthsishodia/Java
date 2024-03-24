import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char ch[]=s.toCharArray();
	    StringBuilder sb=new StringBuilder();
	   
	    for(int i=0;i<ch.length;i++)
	    {
	         boolean repeat=false;
	        for(int j=i+1;j<ch.length;j++)
	        {
	            if(ch[i]==ch[j])
	            {
	                repeat=true;
	                break;
	            }
	        }
	    
	    if(!repeat)
	    {
	        sb.append(ch[i]);
	    }
	 
	    }
		System.out.print(sb);
	}
}
