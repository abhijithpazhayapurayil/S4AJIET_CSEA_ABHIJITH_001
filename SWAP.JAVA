//with 3 variable
public class Main
{
	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println("A="+a+",B="+b);
	  int c=a;
    a=b;
    b=c;
		System.out.println("After Swap");
        System.out.println("A="+a+",B="+b);

	}
}

//with only two variable
public class Main
{
	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println("A="+a+",B="+b);
	    a=a+b;
	    b=a-b;
	    a=a-b;
		System.out.println("After Swap");
        System.out.println("A="+a+",B="+b);

	}
}

//with only one operator
public class Main
{
	public static void main(String[] args) {
		int a=10;
		int b=11;
		System.out.println("A="+a+",B="+b);
	    a=a^b;
	    b=a^b;
	    a=a^b;
		System.out.println("After Swap");
        System.out.println("A="+a+",B="+b);

	}
}
