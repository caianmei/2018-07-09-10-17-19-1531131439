package practice08;

public class Person {
	
	private Integer id;
	/**姓名**/
	private String name;
	/**年龄**/
	private  int age;
	 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
	public Person(int id,String name,int age) {
		this.id = id;
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
	
	public boolean equals(Object person) {
		return this.getClass() == person.getClass()? true : false;
	}
}


