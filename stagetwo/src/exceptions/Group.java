package exceptions;

import java.util.HashSet;
import java.util.Set;

import sources.Groups;
import sources.Subjects;

public class Group extends University {
	
	Set<Student> students = new HashSet<>();
	private Groups group;
	
	public Group (Groups group,Set<Student> students) {
		
		this.setGroup(group);
		this.students = students;
	}
	
	public double getSubjectAverageAssesment(Subjects subject) {
		
		double groupSubjectAverageAssesment = 0;
		
		for(Student student:students) {
			
			groupSubjectAverageAssesment += student.getSubjectAverageAssesment(subject);
		}
		return groupSubjectAverageAssesment;
		
	}

	public Groups getGroup() {
		return group;
	}

	public void setGroup(Groups group) {
		this.group = group;
	}

}
