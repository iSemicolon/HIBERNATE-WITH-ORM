package org.kol.OneToManyApp;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Student_Details")
public class Students {

	 @Id
	    @GeneratedValue
	    
		private int studentId;
		private String Studentname;
		
		@OneToMany(cascade = CascadeType.ALL)
		private List<Courses> courses;

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		
		public String getStudentname() {
			return Studentname;
		}

		public void setStudentname(String studentname) {
			Studentname = studentname;
		}
		
		

		public List<Courses> getCourses() {
			return courses;
		}

		public void setCourses(List<Courses> courses) {
			this.courses = courses;
		}
		
		
		
}
