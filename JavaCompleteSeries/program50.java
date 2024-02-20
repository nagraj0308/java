class program50a{
		int a=0;
	}

class program50b extends program50a{
		int a=0;
	}

class program50c extends program50a{
		int a=0;
	}


class program50d{
	private program50b[] ls=new program50b[5];
	private int i=0;
	
	public void add(program50b p){
		if(i<ls.length){
			ls[i]=p;
			System.out.println("Item added at index"+i);
			i++;
			}
		}
}



class program50{
	public static void main(String args[]){
		program50d o1=new program50d();
		program50b o2=new program50b();
		o1.add(o2);
		o1.add(o2);
		
		}
	}