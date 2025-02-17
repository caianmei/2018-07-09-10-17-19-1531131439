package practice07;

import practice07.Person;

public class Student extends Person{

	private Klass klass;
	
	public Klass getKlass() {
		return klass;
	}
	public void setKlass(Klass klass) {
		this.klass = klass;
	}
	
	public Student(String name, int age,Klass klass) {
		super(name, age);
		this.klass = klass;
	}
	
	/**
	 * functionName:introduce方法
	 * param 
	 * return String
	 * **/
	@Override
	public String introduce() {
		return super.introduce() + " I am a Student. I am at Class "+ this.klass.getNumber() +".";
	}
}
