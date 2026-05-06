//HashSet
import java.util.HashSet;
public class Main
{
	public static void main(String[] args) {
	    HashSet<Integer>list=new HashSet<>();
	    list.add(10);
	    list.add(5);
	    list.add(10);
	    list.add(20);
	    System.out.println(list);
        System.out.println(list.contains(3));
        list.remove(5);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
	}
}

//TreeSet
import java.util.TreeSet;
public class Main
{
	public static void main(String[] args) {
	    TreeSet<Integer>list=new TreeSet<>();
	    list.add(10);
	    list.add(5);
	    list.add(10);
	    list.add(20);
	    System.out.println(list);
        System.out.println(list.contains(3));
        list.remove(5);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
	}
}

//LinkedHashSet
import java.util.LinkedHashSet;
public class Main
{
	public static void main(String[] args) {
	    LinkedHashSet<Integer>list=new LinkedHashSet<>();
	    list.add(10);
	    list.add(5);
	    list.add(10);
	    list.add(20);
	    System.out.println(list);
        System.out.println(list.contains(3));
        list.remove(5);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
	}
}

