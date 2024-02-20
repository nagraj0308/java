class program51a{
		int a=0;
	}

class program51b extends program51a{
		int a=0;
	}

class program51c extends program51a{
		int a=0;
	}


class program51d{
	private program51b[] l1=new program51b[5];
	private program51c[] l2=new program51c[5];
	private int i=0;
	
	public void add(program51b p){
		if(i<l1.length){
			l1[i]=p;
			System.out.println("Item added at index"+i);
			i++;
			}
		}
	public void add(program51c p){
		if(i<l2.length){
			l2[i]=p;
			System.out.println("Item added at index"+i);
			i++;
			}
		}
}



class program51{
	public static void main(String args[]){
		program51d o1=new program51d();
		program51b o2=new program51b();
		program51c o3=new program51c();
		o1.add(o2);
		o1.add(o3);
		o1.add(o2);
		o1.add(o3);
		o1.add(o2);
		o1.add(o3);
		
		}
	}