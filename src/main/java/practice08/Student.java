package practice08;

import practice08.Klass;
import practice08.Person;

public class Student extends Person{

	private Klass klass;
	
	public Klass getKlass() {
		return klass;
	}
	public void setKlass(Klass klass) {
		this.klass = klass;
	}
	
	public Student(int id,String name, int age,Klass klass) {
		super(id,name, age);
		this.klass = klass;
	}
	
	/**
	 * functionName:introduce方法
	 * param 
	 * return String
	 * **/
	@Override
	public String introduce() {
		String introduceResult = super.introduce() + " I am a Student. ";
		introduceResult += (klass.getLeader()==null ||this.getName() != klass.getLeader().getName())? "I am at Class "+ this.klass.getNumber() +"." : "I am Leader of Class "+ this.klass.getNumber() +".";
		return introduceResult;
	}
}
