import java.util.Scanner;
public class program12
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	double[][] mat=new double[row][col];  
	for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)
			{
                 	mat[i][j]=sc.nextDouble();  //nextInt() for integer
			
			}
		
		}
	for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)
		{
                 System.out.print(" "+mat[i][j]);
		
		}
		System.out.println();
	
		}	
	

	
	}
}