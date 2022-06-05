//Example of ArrayList
import java.util.*;
class P177
{
	public static void main(String arr[])
	{
		ArrayList v=new ArrayList();
	//	v.add(null);
		v.add("Durgesh");
		v.add(22);
		v.add("Prince");
		v.add("Adity");
		v.add("Durgesh");
		v.remove();
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
	}
}