package org.kol.ManyToOneApp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher_Details")
public class Teachers {


	@Id
	@GeneratedValue
	private  int teacherId;
	private String teacherName;

	@ManyToOne(cascade = CascadeType.ALL)
	private Students  students;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	
}
