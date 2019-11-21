public class Presenter {
	Model model;
	View view;
	String stringP="P ";
	
	
	void getData(String SV,View view) {
		this.view=view;
		 model = new Model();
		model.getData(SV+stringP,this);
		}


	void setData(String result) {
		view.setData(result+stringP);
	}

}
