package in.sumit.bean;

public class Student {

	private String name;
	private int rollno;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("name : "+name);
		System.out.println("rollno : "+rollno);
		System.out.println("marks: "+marks);
	}
}
