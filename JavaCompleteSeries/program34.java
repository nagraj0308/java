class program34{
 public static void main(String args[]){
	int a[]={1,2,3,4,5};
	change(a);
		for(int k:a) System.out.println(k);
	}
 public static void change(int a[]){
	for(int k=0;k<a.length;k++)
	a[k]+=5;
	}
	
}
