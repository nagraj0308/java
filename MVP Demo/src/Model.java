public class Model {
	String stringM="M ";
	Presenter presenter;
	
	void getData(String SP,Presenter presenter1) {
		this.presenter=presenter1;
		String stringPM=SP+stringM;
		presenter.setData(stringPM);
	}

}
