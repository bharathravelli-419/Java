
public class Main
{
 public static void main(String args[])

{
   outer o = new outer();
   o.display();
}

}
class outer
{

void display()
{
     class inner
{
    public void innerdisplay()
{
   System.out.println("hello Bharath");
}

}
inner i = new inner();
i.innerdisplay();
}

}
/*

op:

hello Bharath
*/