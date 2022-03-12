public class Main
{
public static int max(int x,int y)
{
  return x>y?x:y;

}
public static float max(float x,float y)
{
   return x>y?x:y;
}
public static String max(String str1,String str2)
{
   return str1.length()>str2.length()?str1:str2;
}
  public static void main(String[] args)
{

    System.out.println(max(10,20));
    System.out.println(max(2.4f,56.6f));
    System.out.println(max("bharath","ravelli"));
}
}
/*op:
20
56.6
ravelli
*/
