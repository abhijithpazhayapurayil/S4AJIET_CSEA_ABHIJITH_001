//Largest Number in the array
public class Main
{
	public static void main(String[] args) {
		int arr[]={23,3,45,5,32};
		int n=arr[0];
		System.out.println("largest Element:");
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>n){
		        n=arr[i];
		    }
		}
		System.out.println(n);
	}
}

//Smallest Number in the array
public class Main
{
	public static void main(String[] args) {
		int arr[]={23,3,45,5,32};
		int n=arr[0];
		System.out.println("largest Element:");
		for(int i=0;i<arr.length;i++){
		    if(arr[i]<n){
		        n=arr[i];
		    }
		}
		System.out.println(n);
	}
}

