class program35{ 
 public static void main(String args[]){
	int a[][]={{1,2,3,4,5},{1,2,3},{1}};
	display(a);
	}
  public static void display(int x[][]){
	for(int row=0;row<x.length;row++)
	for(int col=0;col<x[row].length;col++)
	System.out.println(x[row][col]);
	}
}