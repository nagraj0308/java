import java.io.*;
class program7
{
public static void main(String args[]) throws IOException
  {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the no of rows");
     int r=Integer.parseInt(br.readLine());
     for(int i=0;i<r;i++)
      {
         for(int k=r;k>i;k--)
            {
              System.out.print(" ");
            }
           
          int num=1;
          for(int j=0;j<=i;j++)
            {
               System.out.print(num+" ");
	       num=num*(i-j)/(j+1);
           }
         System.out.println();
		}
	}

}