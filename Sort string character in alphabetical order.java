import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char arr[]=s.toCharArray();
	    for(int i=0;i<arr.length;i++)
	    {
	        for(int j=i+1;j<arr.length;j++)
	        {
	            if(arr[i]>arr[j])
	            {
	                char temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	        
	        
	    }
	    
	    System.out.print(new String(arr));
}
}
