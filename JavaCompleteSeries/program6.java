// pascal's triangle (a+b)^n expansion cofficient

class program6a
{
int l;
void pascal(int x)
{
for(l=0;l<=x;l++)
   {
      for(int i=0;i<(x-l);i++)
          System.out.print(" ");
        nci(l);
         System.out.println();
       l++;
    }
       
}


void nci(int x)
{

for(int i=0;i<=l;i++)
System.out.print(fact(l)/(fact(i)*fact(l-i))+" ");

}

int fact(int x)
{
int f=1;
while(x>0)
{
f=f*x;

x--;
}
return f;
}

}




class program6
{
public static void main(String args[])
{
 program6a o1=new program6a();
 int n=10;
  o1.pascal(n); 


}




}



