package practice06;

public class Teacher extends Person {

   private Integer klass;
	
	public Integer getKlass() {
		return klass;
	}
	public void setKlass(int klass) {
		this.klass = klass;
	}
	
	public Teacher(String name, int age) {
		super(name, age);
	}
	
	public Teacher(String name, int age, int klass) {
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
		String introduceString = super.introduce() +  " I am a Teacher. ";
		if (this.klass == null) {
			introduceString += "I teach No Class.";
		} else {
			introduceString += "I teach Class "+ this.klass +".";
		}
		return introduceString;
	}
}
