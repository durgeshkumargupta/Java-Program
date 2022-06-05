//Example of Vector
import java.util.Vector;
class P173
{
	public static void main(String args[])
	{
		Vector<String> v=new Vector<String>();
		v.add("Duresh");
		v.add("Prince");
		v.add("Adity");
		v.add("Luckey");
		v.add("Ratna");
		v.add("Sonu");
		v.add("Pankaj");
		v.add("Ramesh");
		v.add("Ram");
		v.add("Lalan");
		v.add("Divesh");
	//	v.add("Amit");
		System.out.println(v);
		System.out.println("Capacity="+v.capacity());
		System.out.println("Size of Vector="+v.size());
		System.out.println("First Of element="+v.firstElement());
		System.out.println("Last Of Element="+v.lastElement());
		System.out.println("Element Ramesh is at index position="+v.indexOf("Ramesh"));
		System.out.println("Remove Data="+v.remove("Lalan"));
		System.out.println("Remove Data="+v.remove("Ram"));
		System.out.println(v);
		System.out.println("Size of Vector="+v.size());
		System.out.println("Capacity="+v.capacity());
		
		
		
	}
}
	