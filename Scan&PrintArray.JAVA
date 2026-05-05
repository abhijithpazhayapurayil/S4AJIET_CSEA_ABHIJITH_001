//Scan&Print Array
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("Element:");
		for(int i=0;i<n;i++){
		    System.out.println(arr[i]+",");
	   }
	}
}



//Scan&Print Char Array
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		char arr[]=new char [n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.next().charAt(0);
		}
		System.out.println("Element:");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+",");
	   }
	}
	
}
