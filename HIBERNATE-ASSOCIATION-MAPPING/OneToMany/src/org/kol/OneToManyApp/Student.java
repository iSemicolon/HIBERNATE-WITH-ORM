package org.kol.OneToManyApp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetails")
public class Student {
	
	    @Id
	    @GeneratedValue
	    
		private int s_id;
		private String name;
		
		@OneToMany(cascade = CascadeType.ALL)
		private List<Courses> courses;
		
		
		public int getS_id() {
			return s_id;
		}
		public void setS_id(int s_id) {
			this.s_id = s_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Courses> getCourses() {
			return courses;
		}
		public void setCourses(List<Courses> courses) {
			this.courses = courses;
		}
		

	


}
