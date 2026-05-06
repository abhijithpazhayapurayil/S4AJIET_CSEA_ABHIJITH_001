import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    System.out.print("Enter the String:");
	    String s=sc.nextLine();
	    String rev="";
	    for(int i=0;i<s.length();i++){
	        rev=s.charAt(i)+rev;
	    }
	    System.out.println("Reversed String:"+rev);
		if(rev.equals(s)){
		    System.out.print("Its Palindrome");
		}else{
		    System.out.print("Its not Palindrome");
		}
	}
}
