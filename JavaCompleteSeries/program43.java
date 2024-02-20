import java.util.EnumSet;

 enum program43a{
	nc1("nagendra1","2001"),	
	nc2("nagendra2","2002"),	
	nc3("nagendra3","2003"),
	nc4("nagendra3","2003"),
	nc5("nagendra3","2003"),
	nc6("nagendra3","2003");
	private final String name;
	private final String year;

	 program43a(String names,String years){
		name=names;
		year=years;
		}

	public String getname(){
		return  name;
		}
	public String getyear(){
		return  year;
		}
	
}

class program43{
  public static void main(String args[]){
	
	for(program43a x: program43a.values())  //values() is static function
		System.out.printf("%s\t%s\t%s\n",x,x.getname(),x.getyear());
		System.out.println("for a definite range");
	for(program43a x: EnumSet.range(program43a.nc2,program43a.nc5))
		System.out.printf("%s\t%s\t%s\n",x,x.getname(),x.getyear()); 
		}
}
		