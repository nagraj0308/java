class program5
{
public static void main(String args[])
{





   class program5a
    {
      int prime(int a,int b)
         {
           int count=0;
           int i=a;
           while(i<b)
            {
                int j=2;
                int k=1;
                while(j<i)
                {
                   if(i%j==0)
                     {
                      k=2;
                      }
                      j++;
                } 
              if(k==1)
             count++;
              i++;            
           }
      return count;
    }
  }
program5a o1=new program5a();
System.out.println(o1.prime(11,25));
          
}



}