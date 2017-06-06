package dao;

public class TrainNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage(){
		return "Train with this number doesn't exist";
	}
}
