//ArrayList
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


//Linkedlist
import java.util.LinkedList;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
	    LinkedList<Integer>list=new LinkedList<>();
	    list.add(10);
	    list.add(5);
	    list.addFirst(20);
	    System.out.println(list);
	    list.addLast(3);
	    System.out.println(list);
	    System.out.println(list.getFirst());
	    System.out.println(list.getLast());
	    Collections.sort(list);
	    System.out.println("Sort"+list);
	    Collections.sort(list,Collections.reverseOrder());
	    System.out.println("RevSort"+list);
	    list.removeFirst();
	    System.out.println(list);
	    list.removeLast();
	    System.out.println(list);
	    list.remove(0);
	    System.out.println(list);
	    System.out.println("Size:"+list.size());
	    list.clear();
	    System.out.println(list);
	}
}
