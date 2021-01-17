package objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import sources.Groups;
import sources.Subjects;

public class Group extends University {
	
	Set<Student> group = new HashSet<>();
	
	public Group () {}
	
	public double getSubjectAverageAssesment(Subjects subject) {
		List<Double> listSubjectAssesments = new ArrayList<>();
		double groupSubjectAverageAssesment = 0;
		try {
			for(Student student:group) {
			
				listSubjectAssesments.add(student.getSubjectAverageAssesment(subject));
			}
		
			for(Double asses:listSubjectAssesments) {
			
				groupSubjectAverageAssesment += asses;
			}
		}catch(NullPointerException e) {
			System.err.println("Exception is: " + e.getMessage());
		}
		
		return groupSubjectAverageAssesment/listSubjectAssesments.size();
		
	}

	public Set<Student> getGroup() {
		return group;
	}
	
	public void setGroup(Student student){
		
		this.group.add(student);
	}

}
