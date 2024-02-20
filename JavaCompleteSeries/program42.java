 enum program42a{
	nc1("nagendra1","2001"),	
	nc2("nagendra2","2002"),	
	nc3("nagendra3","2003");
	private final String name;
	private final String year;

	 program42a(String names,String years){
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


class program42{
  public static void main(String args[]){
	
	for(program42a x: program42a.values())  //values() is static function
		System.out.printf("%s\t%s\t%s\n",x,x.getname(),x.getyear());
		}
}
		

	