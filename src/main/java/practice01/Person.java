package practice01;

public class Person {
	
	/**����**/
	private String name;
	/**���g**/
	private  int age;
	 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	/**���캯��**/
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * functionName:introduce����
	 * param 
	 * return String
	 * **/
	public String introduce() {
		return "My name is" + this.name + ". I am "+ this.age +" years old.";
	}
}
