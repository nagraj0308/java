
class program23a 
{
    String name;
    double bal;
    program23a(String n, double b)
    {
            name = n;
            bal = b;
    }
    void show()
   {
      if(bal<0)
      System.out.print("--> ");
      System.out.println(name + ": $" + bal);
   }
}
class program23 
{
     public static void main(String args[])
    {
       program23a current[] = new program23a[3];
       current[0] = new program23a("K. J. Fielding", 123.23);
       current[1] = new program23a("Will Tell", 157.02);
       current[2] = new program23a("Tom Jackson", -12.33);
      for(int i=0; i<3; i++) current[i].show();
    }
}