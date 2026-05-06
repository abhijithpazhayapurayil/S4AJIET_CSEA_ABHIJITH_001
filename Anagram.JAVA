//Java Compiler
import java.util.Scanner;
import java.util.Arrays;
class solu{
public boolean isAnagram(String s1,String s2){
    	if(s1.length()!=s2.length()){
		    return false;
		}else{
		    char [] s11=s1.toCharArray();
		    char [] s22=s2.toCharArray();
		    Arrays.sort(s11);
		    Arrays.sort(s22);
		    return (Arrays.equals(s11,s22));
		}
}
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter String1:");
		String s1=sc.nextLine();
		System.out.println("Enter String1:");
		String s2=sc.nextLine();
		solu s=new solu();
	    boolean result=s.isAnagram(s1,s2);
	     if (result) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
	}
}


//Leet(242)
import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
		    return false;
		}else{
		    char [] s1=s.toCharArray();
		    char [] s2=t.toCharArray();
		    Arrays.sort(s1);
		    Arrays.sort(s2);
		    return Arrays.equals(s1,s2);
		}
    }
}
