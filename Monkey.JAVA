public class Main
{
	public static void main(String[] args) {
	    int i, c, d;
	    int n=20;
	    int k=2;
	    int j=3;
	    int m=12;
	    int p=12;
	    int a=m%k;
	    int b=p%j;
	    if(a!=0||b!=0){
	        c=m/k;
	        d=p/j;
	        i=(n-(c+d))-1;

	    }else{
	        c=m/k;
	        d=p/j;
	        i=n-(c+d);
	    }
		System.out.println("Monkey Left on Tree:"+i);
	}
}
