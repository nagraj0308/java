public class View {
	String stringV="V ";
	public static void main(String args[]) {
		
	View view=new View();
		view.getData();
	}
	void getData() {
		Presenter presenter=new Presenter();
		presenter.getData(stringV,this);
	}
	void setData(String result) {
		System.out.println(result+stringV);
	}

}
