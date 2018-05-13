package demoproject;

public class BoClass {
	private	String name;
	
	private	String course;
	private	String gender;
	private	String city1;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "BoClass [name=" + name + ", course=" + course + ", gender=" + gender + ", city=" + city1 + "]";
	}
	
	

}
