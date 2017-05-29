package delegation;

public class Plane {

	private String name;
	private String model;
	Engine engine = new Engine();

	public Plane() {
		super();
	}

	public Plane(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Plane [name=" + name + ", model=" + model + "]";
	}
	
	public void planeSpinPropeler(){
		engine.spinPropeler();
	}

}
















