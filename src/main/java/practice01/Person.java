package practice01;

public class Person {
	
	/**姓名**/
	private String name;
	/**年龄**/
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

	/**构造函数**/
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * functionName:introduce方法
	 * param 
	 * return String
	 * **/
	public String introduce() {
		return "My name is " + this.name + ". I am "+ this.age +" years old.";
	}
}
