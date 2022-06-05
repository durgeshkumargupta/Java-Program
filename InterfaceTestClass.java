interface IntroductionOfInterface
{
    int x=6;
    void m1();
    abstract void m3();
    static void m4(){
        System.out.println("m4 static method");
    }
    default void m5()
    {
        System.out.println("m5 default method");
    }
}
interface I1
{
    int x=6;
    public static final int y=7;
    void m1();
    public abstract void m2();
}
abstract class A implements I1
{
    @Override
    public void m1()
    {
        System.out.println("m1 method implements in class A");
    }
}
class B extends A implements I1
{
    @Override
    public void m2()
    {
        System.out.println("m2 method implemented in class B");
    }
}
class InterfaceTestClass
{
    public static void main(String[] args) 
	{
       I1 obj=new B();

        obj.m1();
        obj.m2();
        System.out.println("obj.x="+obj.x);
        System.out.println("obj.y="+obj.y);
        System.out.println("I1.x="+I1.x);
        System.out.println("I1.y="+I1.y);
    }
}
