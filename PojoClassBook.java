public class PojoClassBook
{
	private int page_no;
	public void setPageNo(int page_no)
	{
		if(page_no>0)
		     this.page_no=page_no;
	    else 
		{	System.out.println("Invalid Page Number is"+page_no);
	        System.exit(0);
		}
		
	}
	public int showPageNo()
	{
		return page_no;
	}
}