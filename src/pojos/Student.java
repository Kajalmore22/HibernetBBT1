package pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {

	
	@Id
	private int rollno;
	private String Name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Name=" + Name + "]";
	}
	
	
	

}
