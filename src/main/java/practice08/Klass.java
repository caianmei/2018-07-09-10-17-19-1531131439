package practice08;

import practice08.Student;

public class Klass {
	
	private Integer number;
	
	private Student leader;
	
	public  Klass(int number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Student getLeader() {
		return this.leader;
	}
	
//	public void setLeader(Student leader) {
//		this.leader = leader;
//	}
	public String getDisplayName() {
		return "Class " + this.number;
	}
	
	public void assignLeader(Student leader) {
		this.leader = leader;
//		return "I am a Student. I am Leader of Class "+this.number+".";
	}
}
