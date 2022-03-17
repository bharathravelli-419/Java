public class Interfaces 

{
 public static void main(String[] args)

{
      Iface1 i  =new subclass();
  i.method1();
Iface2 i2 =new subclass();
  i2.method2();


subclass s = new subclass();
s.method1();
s.method2();

}

}

interface Iface1
{
  void method1();

}

interface Iface2
{
     void method2();

}

class subclass implements Iface1,Iface2
{

public void method1()
{
 System.out.println("the method1()");
}
public void method2()
{
 System.out.println("the method2()");
}

}


/*
op:

the method1()
the method2()
the method1()
the method2()

*/