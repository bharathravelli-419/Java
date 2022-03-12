public class Main
{

public static void show(int... x)
{
  for(int a :x)
    System.out.println(a);
} 
  public static void main(String[] args)
{

// variable number of arguments ,the method treats it as an array and It is also called as Elipse
     show();
show(10);
show(20);
show(12,23,345,56,76,89,90);
}
}


/*op:
20
56.6
ravelli
*/
