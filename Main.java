
public class Main
{


  public static void main(String[] args)
{
    circle c = new circle(10);
   System.out.println("The area : "+c.area()+ " The perimeter: "+ c.perimeter());

}
}
class circle
{
  private int radius;
  
public circle(int radius)
{
   this.radius =  radius;
}
public float area()
{
   return (float)(3.14* radius*radius);
}
public float perimeter()
{
  return (float)(2*3.14* radius);
}

}


/*op:
The area : 314.0 The perimeter: 62.8
*/
