public class Main
{
  public static void main(String[] args)
{

int a[][];
a = new int[3][];
a[0] = new int[5];
a[1] = new int[3];
a[2] = new int[1];
for(int i =0;i<a.length;i++)
{
     for(int j =0;j<a[i].length;j++)
{
  System.out.print(a[i][j]);
}
  System.out.println();
}

  }

}

/*op:
00000
000
0
*/
