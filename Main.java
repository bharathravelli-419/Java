
public class Main
{


  public static void main(String[] args)
{
    
     superclass s = new subclass(20,30);
       s.method1();
}


}
class superclass
{
   private int ab;
private int bc;
  public superclass(int a,int b)

{
  
  this.ab = a;
this.bc =b;

}
public void method1()
{
  System.out.println("this value of a is :"+ab);

}


}


class subclass extends superclass
{
  private int a;
private int b;
   public subclass(int a ,int b)
{
   super(a,b);
this.a = a;
this.b = b;
}
public void method1()
{
  System.out.println("this value of a is :"+a);

}



}



/*op:

this value of a is :20



*/
