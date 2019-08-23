package practice08;

import practice08.Klass;
import practice08.Person;
import practice08.Student;

public class Teacher extends Person {

	   private Klass klass;
		
		public Klass getKlass() {
			return klass;
		}
		public void setKlass(Klass klass) {
			this.klass = klass;
		}
		
		public Teacher(int id,String name, int age) {
			super(id,name, age);
		}
						
		public Teacher(int id,String name, int age, Klass klass) {
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
			String introduceString = super.introduce() +  " I am a Teacher. ";
			introduceString += this.klass == null ? "I teach No Class.":"I teach Class "+ this.klass.getNumber() +".";			
			return introduceString;
		}
		
		public String introduceWith(Student student) {
			String introduceString = super.introduce() +  " I am a Teacher. ";
			introduceString += student.getKlass().getNumber() != this.klass.getNumber() ? "I don't teach " + student.getName() + ".":"I teach "+ student.getName() +".";			
			return introduceString;
		}
	}

