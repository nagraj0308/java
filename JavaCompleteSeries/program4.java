



class program4
{
public static void main(String args[])
{
int a=10;
 class program4a
{
void factor(int x)
{ 
 int i=x; 
 while(i>0)
   {   
     if(x%i==0) 
     System.out.print(i); 
       i--;
    }
}
}



program4a o1=new program4a();

o1.factor(a);


}

}



