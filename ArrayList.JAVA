import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<String>list=new ArrayList<>();
	    list.add("JAVA");
	    list.add("Python");
	    list.add("JAVA");
	    System.out.println(list);
	    list.add(0,"C++");
	    System.out.println(list);
	    list.set(2,"C");
	    System.out.println(list);
	    System.out.println(list.get(0));
	    list.remove(3);
	    System.out.println(list);
	    System.out.println(list.size());
	    list.clear();
	    System.out.println(list);
	}
}
