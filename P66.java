class P66
{
	public static void main(String []agrs)
	{
		String v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;
		  v1="java";
		  int n=10;
		  v2=v1.concat("Hello");
		  v3="Hello".concat(v1);
		  v4=v1.concat("10");
//		  v5=v1.concat(10);   error 
		  v6=v1.concat(10+2+"Hello");
		  v7=v2.concat("Hello"+2+2);
		  v8=v1.concat("Hello"+2/2+2);
		  v9=v1.concat(2/2+2+"Hello");
		  v10="my"+"name".concat(2/2+2+"Durgesh"+2/2+2);
		  System.out.println(v1+" "+v2+" "+v3+" "+v4+" "+v10+" "+v6+" "+v7+" "+v8+" "+v9);
		  
		  
	}
}
	
		  