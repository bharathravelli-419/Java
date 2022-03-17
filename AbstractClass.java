public class AbstractClass
{
  public static void main(String args[])

{
      Super s = new sub();
       s.meth1();
superclass s1  = new subclass(2);
s1.method();

}

}

abstract class Super
{

 abstract public void meth1();


}
class sub extends Super
{

   public void meth1()
{

  System.out.println("this is The sub class");
}

}


abstract class superclass
{

private int a;

 public superclass(int a)
{
this.a = a;
  System.out.println("a's value is:"+ a);
}

abstract public void method();

}

class subclass extends superclass
{
     public subclass(int a)
{
     super(a);
}
public void method()
{
 System.out.println("this is a sub class method");
}
}



/*
op:
this is The sub class
a's value is:2
this is a sub class method
*/