class P12
{
	public static void main(String []arr)
	{
		int sum=0,i;
		for(i=0;i<arr.length;i++)
		{
			sum=sum+Integer.parseInt(arr[i]);
		}
		System.out.print(sum);
    }
}