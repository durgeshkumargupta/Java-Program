public class Book
{
	public static void main(String args[])
	{
		PojoClassBook obj=new PojoClassBook();
		obj.setPageNo(199);
		System.out.println("page No="+obj.showPageNo());
		obj.setPageNo(-100);
		System.out.println("page No="+obj.showPageNo());
	}
}