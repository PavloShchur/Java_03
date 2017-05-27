package economics;

public class Department {

	private String name_of_department;

	public Department(String name_of_department) {
		super();
		this.name_of_department = name_of_department;
	}

	public String getName_of_department() {
		return name_of_department;
	}

	public void setName_of_department(String name_of_department) {
		this.name_of_department = name_of_department;
	}

	@Override
	public String toString() {
		return "Department [name_of_department=" + name_of_department + "]";
	}

}
