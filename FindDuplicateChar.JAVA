import java.util.Scanner;
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter String:");
	    String s=sc.nextLine();
	    HashMap<Character,Integer>k=new HashMap<>();
	    for(char c:s.toCharArray()){
	        if(k.containsKey(c)){
	            k.put(c,k.get(c)+1);
	        }else{
	            k.put(c,1);
	        }
	    }
	    System.out.println(k);
	    for(char d: k.keySet()){
	            if(k.get(d)>1){
	             System.out.println(d+"-"+k.get(d));
	       }
	    }    
	}
}
