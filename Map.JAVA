//HashMap
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String>list=new HashMap<>();
	    list.put(101,"Abhi");
	    list.put(102,"Aby");
	    System.out.println(list);
	    System.out.println(list.get(101));
	    System.out.println("Remove:"+list.remove(101));
        System.out.println(list);
        System.out.println("Size:"+list.size());
        list.clear();
        System.out.println(list);
	}
}

//TreeMap(Ordered)
import java.util.TreeMap;
public class Main
{
	public static void main(String[] args) {
	    TreeMap<Integer,String>list=new TreeMap<>();
	    list.put(103,"Abhi");
	    list.put(102,"Aby");
	    System.out.println(list);
	    System.out.println(list.get(102));
	    System.out.println("Remove:"+list.remove(102));
        System.out.println(list);
        System.out.println("Size:"+list.size());
        list.clear();
        System.out.println(list);
	}
}

//LinkedHashMap(o/p in Given Order)
import java.util.LinkedHashMap;
public class Main
{
	public static void main(String[] args) {
	    LinkedHashMap<Integer,String>list=new LinkedHashMap<>();
	    list.put(103,"Abhi");
	    list.put(101,"Abee");
	    list.put(102,"Aby");
	    System.out.println(list);
	    System.out.println(list.get(102));
	    System.out.println("Remove:"+list.remove(102));
        System.out.println(list);
        System.out.println("Size:"+list.size());
        list.clear();
        System.out.println(list);
	}
}
