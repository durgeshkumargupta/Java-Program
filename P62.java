class P62
{
	public static void main(String []ager)
	{
		StringBuffer s1=new StringBuffer();
		System.out.println("s1 Length: "+s1.length());
		System.out.println("s1 capacity:"+s1.capacity()); 
		
		StringBuffer s2=new StringBuffer(100);
		System.out.println("s2 length: "+s2.length());
		System.out.println("s2 capacity: "+s2.capacity());
		
		StringBuffer s3=new StringBuffer("java");
		System.out.println("s3 length: "+s3.length());
		System.out.println("s3 capacity: "+s3.capacity());
	}
}	
