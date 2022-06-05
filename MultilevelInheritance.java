class A
{
    int x=11;
    int y=12;
    void show()
    {
        System.out.println("I am show method  of class A");
    }
}
class B extends  A{
    int a=10;
    int b=23;
    void display()
    {
        System.out.println("I am Display method class B");
    }
    @Override
    void show()
    {
        super.show();
        this.display();
        System.out.println("I am show method of class B");
    }
}
class C extends B {
    int a=10;
    void run()
    {
        this.show();
        System.out.println("I am run method of class C");
    }
}
class MultilevelInheritance
{
    public static void main(String[] args) {
        A obj=new C();
        obj.show();
   //     ((C) obj).run();
    }
}

/** O/P:-
*       I am show method  of class A
*       I am Display method class B
*       I am show method of class B
*
*
*
*/
