
public class Main
{
 public static void main(String args[])

{
   outer o = new outer();
   o.outerDisplay();
 // outer.inner  i = new outer().new inner();
//outer$inner.class is created
}

}

class outer
{
  private int x=10;
class inner
{
   private int y = 20;
void innerDisplay()
{
    System.out.println(x);
 System.out.println(y);
}

}

void outerDisplay()
{
  inner i = new inner();
i.innerDisplay();
 System.out.println(x);
  System.out.println("y is not accessible");
}

}


/*

op:
10
20
10
y is not accessible
*/