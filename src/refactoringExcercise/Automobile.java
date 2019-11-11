package refactoringExcercise;

public class Automobile extends Vehicle implements Motorized{
	
	private String make;
	private String model;
	protected String motor;
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String string) {
		this.model = string;
	}

	@Override
	public String getMotor() {
		return motor;
	}

	@Override
	public void setMotor(String string) {
		motor = string;
	}
}

