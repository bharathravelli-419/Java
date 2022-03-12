public class Main
{
  public static  void update(int a[])
{

a[0] = 234;
}
  public static void main(String[] args)
{


  int a[]= {10,20,30,40};
  System.out.println("before Calling the Method");
  System.out.println();
for(int x:a)
{
  System.out.print(x+" ");
}
System.out.println();
  System.out.println("After Calling the method");
  System.out.println();
   update(a);
for(int x:a)
{
   System.out.print(x + " ");
}

}
}
/*op:
before Calling the Method

10 20 30 40
After Calling the method
234 20 30 40
*/
