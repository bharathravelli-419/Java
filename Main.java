
public class Main
{
 public static void main(String args[])

{
   outer o = new outer();
   o.meth();
}

}

// Interface My can also be used Here 
abstract class My
{
   abstract void display();


}
class outer
{

public void meth()
{
  My m = new My()
{
   public void display()
{
  System.out.println("Hello Bharath");
}

};
m.display();
}
}

/*

op:

Hello Bharath
*/