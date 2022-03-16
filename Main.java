
public class Main
{


  public static void main(String[] args)
{

    square s = new square(10);
    System.out.println(s.area()+" " + s.perimeter());
    
}


}

class rectangle
{
private double length;
private double breadth;
 public rectangle(double length,double breadth)
{
  this.length  = length; 
  this.breadth = breadth; 
}

public double area()
{
    return length* breadth;
}
public double perimeter()
{
 return 2*(length+breadth);
}

}

class square extends rectangle
{ 
   private double length;
  public square(double length)

{
   super(length,length);
}



}


/*op:





*/
