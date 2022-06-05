import java.util.Stack;
class StackExample
{
	public static void main(String[] args)
	{
		Stack <String> v=new Stack<String>();
		System.out.println(v.size());
		v.add("Prince kumar");
		v.add("Adity");
		System.out.println(v);
		System.out.println(v.size());
	}
}